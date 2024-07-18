document.getElementById('formulario-contacto').addEventListener('submit', function(event) {
    event.preventDefault(); 

    // Recolectar los datos del formulario
    let formData = {
        nombre: document.getElementById('nombre').value,
        apellido: document.getElementById('apellido').value
    };

    // Enviar los datos al servidor usando fetch API
    fetch('/user/create-user', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(formData)
    })
    .then(response => response.text())
    .then(data => {
        alert(data); // Mostrar respuesta del servidor
        document.getElementById('formulario-contacto').reset(); // Limpiar el formulario
    })
    .catch(error => {
        console.error('Error:', error);
    });
});
