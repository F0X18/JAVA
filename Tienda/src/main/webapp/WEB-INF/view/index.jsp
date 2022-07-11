<!-- redirección a la URL /tienda/cliente/lista/ -->
<% response.sendRedirect("cliente/lista"); %>
<!-- WebContent/index.jsp -->
<p>
<a href="{pageContext.request.contextPath}/cliente/lista">Lista de clientes</a>
</p>