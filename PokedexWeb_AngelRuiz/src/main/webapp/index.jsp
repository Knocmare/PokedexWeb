<%@page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>PokedexWeb - Registrar Pokémon</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estilos/style.css">
    </head>
    <body>
        <header></header>
        <main>
            <div class="formPokemon">
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
                <a href="list" class="btnVerPokemon">Ver Pokemones Registrados</a>
            </div>
        </main>
        <footer></footer>
    </body>
</html>
