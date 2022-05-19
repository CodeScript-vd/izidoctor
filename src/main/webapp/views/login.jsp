<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>iziDoctor | Plataforma Online para Citas Médicas</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<section class="login">
        <div class="login__content">
        	<div class="login__logo">
                <svg x="0px" y="0px" viewBox="0 0 179 48" width="179px">
                    <use xlink:href="images/icons.svg#logo"></use>
                </svg>
            </div>
            <h1 class="login__title">
                Iniciar Sesión
            </h1>
            <form class="form">
                <div class="form__group">
                    <label>Email</label>
                    <input type="text" name="email">
                </div>
                <div class="form__group__separation"></div>
                <div class="form__group">
                    <label>Contraseña</label>
                    <input type="password" name="password">
                </div>
                <div class="form__group__separation"></div>
                <div class="form__group">
                    <button class="button btn-main-full">Iniciar Sesión</button>
                </div>
            </form>
        </div>
    </section>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="js/app.js"></script>
</body>