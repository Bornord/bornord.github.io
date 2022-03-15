<template>
	<div id="app">
		<nav>
			<NavLink url="/" text="Test"/><br/>
			<NavLink url = "/about" text = "À propos"/><br/>
			<NavLink url = "/contact" text = "Contact"/><br/>
		</nav>
		<p>Bienvenue sur notre page d'<NavLink url= "/" text = "Accueil" /></p>
	</div>
</template>

<script>
import NavLink from './components/HomeLink.vue'

export default {
	name: 'App',
	components: {
		NavLink
	}
}
</script>

