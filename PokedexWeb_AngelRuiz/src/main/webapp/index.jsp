<%@page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>PokedexWeb - Registrar Pokémon</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estilos/style.css">
    </head>
    <body>
        <main>
            <div class="Pokedex">
                <h1>Registrar Nuevo Pokemon</h1>
                <form action="addPokemon" method="post">
                    <label>Nombre</label>
                    <input type="text" name="nombre" required>

                    <label>Número</label>
                    <input type="text" name="numero" required>

                    <label>Tipo</label>
                    <input type="text" name="tipo" required>

                    <label>Imagen</label>
                    <input type="url" name="imagen" placeholder="https://..." required>

                    <button type="submit">Agregar Pokémon</button>
                </form>
                <a href="listaPokemon.jsp" class="btnVerPokemon">Ver Pokemones Registrados</a>
            </div>
        </main>
    </body>
</html>
