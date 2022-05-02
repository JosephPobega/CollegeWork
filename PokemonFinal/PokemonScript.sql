/* Displays pokemons table by type */
select * from pokemons
order by type;

/* Displays pokemon trainers catagorized by age */
select * from trainer
order by age;

/* Orders region table by quanitity of Pokemon per area*/
select * from region
order by quantityofPokemon;

/* Displays pokemon games catagorized by year */
select * from games
order by year;

/*Dispolays city/areas */
select * from towns;

/* Displays  citys/areas from regions */
select * from towns join region;

/*Displays regions where Pokemon quantity is less than 150 */
select * from region
where quantityofPokemon < 150;
