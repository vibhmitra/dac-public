<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>SpringMVC Web App</title>
</head>
<body>
	<h2>This is the Example of Spring MVC Web App</h2>
	<p>Some Features of Spring Web MVC :</p>
	<ul>
		<li>Spring MVC is a model view controller-based web framework
			under the Spring framework.</li>
		<li>It provides ready to use features for building a web
			application</li>
		<li>Requires Manual build configuration.</li>
		<li>A Deployment descriptor is <mark>required</mark>.
		</li>
		<li>It specifies each dependency separately.</li>
		<li>A Deployment descriptor is required.</li>
	</ul>

		<ul>
			<li>Also this project contains only Controller and Views.
				<ul>
					<li>Controller : <code>HelloController</code> or <code>HelloController.java</code></li>
					<li>View : <code>hello.jsp</code></li>
					<li>Dispatcher Configuration / Bean Configuration / Servlet Configuration
						<ul>
							<li>Servlet Mapping / Dispatcher Mapping: <code>web.xml</code></li>
							<li>View Resolver / URL Pattern Configuration: <code>HelloWebConfig-servlet.xml</code></li>
						</ul>
					</li>
				</ul>
			</li>
			<strong><pre>**Note: This project does not have Model. Umm...Model is just a class that deals with data. :/
 And oh-boy! don't forget to add those shitty ass dependencies (like JSP servlet API, JSTL, and that weird
 taglib tag on top of jsp file on which you are going to use that expression lanaguge like tags. Trust me! it took me 
 2-3 hours to finally figure it out what was happening. 😀😣)</pre></strong>
		</ul>
	<h4>
		<a href="hello">HelloController</a>
	</h4>
</body>
</html>
