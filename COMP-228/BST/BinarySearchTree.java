package adts;

import java.util.Iterator;
import java.util.ArrayList;

import interfaces.*;
import iterators.BSTIterator;
import nodes.BSTNode;


enum TraversalType {
	PREORDER, INORDER, POSTORDER, REVORDER
}


public class BinarySearchTree<T extends Comparable<T>> 
             implements BSTInterface<T>, Iterable<T> {
	
	protected BSTNode<T> root;   
	
	boolean found;   // used by remove
	
	T[] rebalanceArray;  // for rebalancing the tree
	int rebalanceIndex;  //           "
	
	// for traversals
	protected TraversalType travType;
	ArrayList<T> travList;
	

	public BinarySearchTree() {
		root = null;
		travType = TraversalType.INORDER;
	}
	
	
	public void add (T element) {
		root = recAdd(element, root);
    }
	
	private BSTNode<T> recAdd(T element, BSTNode<T> tree) {
		if (tree == null) {
			tree = new BSTNode<T>(element);
		}
		else {
			if (element.compareTo(tree.getData()) <= 0) {
				tree.setLeft(recAdd(element, tree.getLeft()));  // add to left subtree
				
			}
			else {
				tree.setRight(recAdd(element, tree.getRight()));  // add to right subtree
		    }
		}
		return tree;
	}
	
	
	public boolean remove (T element) {
		root = recRemove(element, root);
		return found;
	}
	  
	private BSTNode<T> recRemove(T element, BSTNode<T> tree) {
		if (tree == null) {
			found = false;
		}
		else {
			if (element.compareTo(tree.getData()) < 0) {
				tree.setLeft(recRemove(element, tree.getLeft()));
			}
			else {
				if (element.compareTo(tree.getData()) > 0) {
					tree.setRight(recRemove(element, tree.getRight()));
				}
				else {
					tree = removeNode(tree);
					found = true;
				}
			}
		}
		return tree;
	}

	private BSTNode<T> removeNode(BSTNode<T> tree) {
		
		T payload;
			  
		if (tree.getLeft() == null) {
			return tree.getRight();
		}
		else {
			if (tree.getRight() == null) {
				return tree.getLeft();
			}
			else {
				payload = getPredecessor(tree.getLeft());
				tree.setData(payload);
				tree.setLeft(recRemove(payload, tree.getLeft()));
				return tree;
			}
		}
	}

	private T getPredecessor(BSTNode<T> tree) {
		while (tree.getRight() != null) {
			tree = tree.getRight();
		}
		return tree.getData();
	}

	  
	public int size() {
		return recSize(root);
	}
	
	private int recSize(BSTNode<T> tree) {
		if (tree == null) {
			return 0;
		}
		else {
			return recSize(tree.getLeft()) + recSize(tree.getRight()) + 1;
		}
	}
	
	//////////////// PP5 CODE \\\\\\\\\\\\\\\\\\\
	
	//LEAFCOUNT
	public int leafCount() {
        return countLeaves(root);
    }

    private int countLeaves(BSTNode<T> tree) {
        if (tree == null) {
            return 0;
        } else if (tree.getLeft() == null && tree.getRight() == null) {
            return 1;
        } else {
            return countLeaves(tree.getLeft()) + countLeaves(tree.getRight());
        }
    }
    
    
    
    //NODESATLEVEL
    public int nodesAtLevel(int level) {
        if (root == null) {
            return -1; 
        } else {
            return countNodesAtLevel(root, level, 0);
        }
    }
    

    private int countNodesAtLevel(BSTNode<T> tree, int targetLevel, int currentLevel) {
        if (tree == null) {
            return 0;
        } else if (currentLevel == targetLevel) {
            return 1; 
        } else {
        
            return countNodesAtLevel(tree.getLeft(), targetLevel, currentLevel + 1)
                 + countNodesAtLevel(tree.getRight(), targetLevel, currentLevel + 1);
        }
    }
    
    
    
    
    //SAMELEVEL
    public boolean sameShape(BinarySearchTree<T> other) {
        return compareShapes(root, other.root);
    }
    
    
    
    //MEDIAN
    public T median() {
        int size = size();
        if (size == 0) {
            return null; 
        }

        ArrayList<T> sortedList = new ArrayList<>();
        inOrder(root, sortedList);

        int middle = size / 2;
        if (size % 2 == 0) {
            return sortedList.get(middle - 1);
        } else {
  
            return sortedList.get(middle);
        }
    }
    
    
    private void inOrder(BSTNode<T> tree, ArrayList<T> list) {
        if (tree != null) {
            inOrder(tree.getLeft(), list);
            list.add(tree.getData());
            inOrder(tree.getRight(), list);
        }
    }
    

    private boolean compareShapes(BSTNode<T> tree1, BSTNode<T> tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }
        else if ((tree1 == null && tree2 != null) || (tree1 != null && tree2 == null)) {
            return false;
        }
        else {
            return compareShapes(tree1.getLeft(), tree2.getLeft())
                && compareShapes(tree1.getRight(), tree2.getRight());
        }
    }
    
    
    
    
    
	// this implementation of a size operation demonstrates that
	// it is possible to visit all the nodes of the tree without recursion
	public int size2() {
		int count = 0;
		if (root != null) {
			LLStack<BSTNode<T>> hold = new LLStack<BSTNode<T>>();
			BSTNode<T> currNode;
			hold.push(root);
			while (!hold.isEmpty()) {
				currNode = hold.peek();
				hold.pop();
				count++;
				if (currNode.getLeft() != null) {
					hold.push(currNode.getLeft());
				}
				if (currNode.getRight() != null) {
					hold.push(currNode.getRight());
				}
			}
		}
		return count;
	}

	  
	public boolean isEmpty() {
		return (root == null);
	}
	
	
	public boolean contains (T element) {
		return recContains(element, root);
	}
	
	private boolean recContains(T element, BSTNode<T> tree) {
		if (tree == null) {
			return false;
		}
		else {
	    	if (element.compareTo(tree.getData()) < 0) {
	    		return recContains(element, tree.getLeft());  // search left subtree
	    	}
	        else {
	        	if (element.compareTo(tree.getData()) > 0) {
	        		return recContains(element, tree.getRight());  // search right subtree
	        	}
	            else {
	                return true;  // element.compareTo(tree, the subtree's root) == 0
	            }
	        }
		}
	}

	
	public T get(T element) {
		return recGet(element, root);
	}
	
	private T recGet(T element, BSTNode<T> tree) {
		if (tree == null) {
			return null;
		}
		else {
			if (element.compareTo(tree.getData()) < 0) {
				return recGet(element, tree.getLeft());  // get from left subtree
			}
			else {
				if (element.compareTo(tree.getData()) > 0) {
					return recGet(element, tree.getRight());  // get from right subtree
				}
				else {
					return tree.getData();  // element is found!
				}
			}
		}
	}
	
	// -------- traversal related code ----------------
	
	public void setTraversalType(String order) {
        if (order.equalsIgnoreCase("pre")) {
            travType = TraversalType.PREORDER;
        } else if (order.equalsIgnoreCase("in")) {
            travType = TraversalType.INORDER;
        } else if (order.equalsIgnoreCase("post")) {
            travType = TraversalType.POSTORDER;
        } else if (order.equalsIgnoreCase("rev")) {
            travType = TraversalType.REVORDER;
        } else {
            travType = TraversalType.INORDER;
        }
    }
	
	// iterator object instantiation for enhanced for loop:
	public Iterator<T> iterator() {
        travList = new ArrayList<>(size());

        switch (travType) {
            case INORDER:
                inOrder(root);
                break;
            case PREORDER:
                preOrder(root);
                break;
            case POSTORDER:
                postOrder(root);
                break;
            case REVORDER:
                revOrder(root);
                break;
            default:
                inOrder(root);
        }

        return new BSTIterator(travList);
    }

	
	private void inOrder(BSTNode<T> tree) {
		if (tree != null) {
			inOrder(tree.getLeft());
			travList.add(tree.getData());
			inOrder(tree.getRight());
		}
	}
	
	private void preOrder(BSTNode<T> tree) {
		if (tree != null) {
			travList.add(tree.getData());
			preOrder(tree.getLeft());
			preOrder(tree.getRight());
		}
	}
	
	private void postOrder(BSTNode<T> tree) {
		if (tree != null) {
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			travList.add(tree.getData());
		}
	}

	//revorder 
	
	private void revOrder(BSTNode<T> tree) {
        if (tree != null) {
            revOrder(tree.getRight());
            travList.add(tree.getData());
            revOrder(tree.getLeft());
        }
    }
	
	// ------------------------------------------------

	
	
	public void rebalance() {
		rebalanceArray = (T[]) new Comparable[size()];
		rebalanceIndex = -1;
		fillRebalanceArray(root);
		root = null;
		recRebalance(0, rebalanceArray.length - 1);
	}
	
	private void fillRebalanceArray(BSTNode<T> tree) {
		if (tree != null) {
			fillRebalanceArray(tree.getLeft());
			rebalanceArray[++rebalanceIndex] = tree.getData();
			fillRebalanceArray(tree.getRight());
		}
	}
	
	private void recRebalance(int first, int last) {
		if (first <= last) {
			int mid = first + (last - first) / 2;
			root = recAdd(rebalanceArray[mid], root);
			recRebalance(first, mid-1);
			recRebalance(mid+1, last);
		}
	}
	
}
