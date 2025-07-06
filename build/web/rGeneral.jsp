<%-- 
    Document   : rGeneral
    Created on : 5/07/2025, 10:00:38 PM
    Author     : ivanb
--%>

<jsp:include page="includes/header.jsp"/>


<div class="container">
    <div class="container">
        <div class="order-details">
            <div class="row"><!--inicia fila 1 -->
                <center>
                    <form method="post" action="rUsuario1.jsp">
                        <center>
                            <h3>ALTA USUARIO</h3>
                            <img src="./img//icon/inisesionalum2.jpg"/>
                            <div col-sm-6>
                                <label>USUARIO</label>
                                <input class="input" type="text" placeholder="nombre" required name="nombre"/>

                                <label>PUESTO</label>
                                <input class="input" type="text" placeholder="puesto" required name="puesto"/>

                                <label>DIAS TRABAJADOS</label>
                                <input class="input" type="text" placeholder="dias trabajados" required name="dias_trabajo"/>

                                <label>SUELDO</label>
                                <input class="input" type="text" placeholder="sueldo diario" required name="sueldo"/>

                                <br><br>
                                <input type="submit" class="primary-btn order-submit" value="Registrame"/>

                            </div>
                        </center>
                    </form>
                </center>
            </div><!--termina fila 1 -->
        </div>
    </div>


    <jsp:include page="includes/footer.jsp"/>