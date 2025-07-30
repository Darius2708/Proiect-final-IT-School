document.addEventListener("DOMContentLoaded", () => {
    const cartContainer = document.getElementById("cart-items");
    const cartItems = JSON.parse(localStorage.getItem("cart")) || [];

    if (cartItems.length === 0) {
        cartContainer.innerHTML = "<p>Coșul este gol.</p>";
        return;
    }

    let total = 0;

    cartItems.forEach((produs, index) => {
        const produsDiv = document.createElement("div");
        produsDiv.classList.add("cart-item");

        const totalProdus = (produs.pret * produs.cantitate).toFixed(2);
        total += parseFloat(totalProdus);

        produsDiv.innerHTML = `
            <img src="${produs.imagineUrl || 'https://via.placeholder.com/100'}" alt="${produs.nume}" width="100">
            <h3>${produs.nume}</h3>
            <p><strong>Descriere:</strong> ${produs.descriere || '-'}</p>
            <p><strong>Brand:</strong> ${produs.brand || '-'}</p>
            <p><strong>Preț unitar:</strong> ${produs.pret} RON</p>
            <p><strong>Cantitate:</strong> ${produs.cantitate}</p>
            <p><strong>Total:</strong> ${totalProdus} RON</p>
            <button class="sterge-btn">Șterge</button>
            <hr>
        `;

        produsDiv.querySelector(".sterge-btn").addEventListener("click", () => {
            cartItems.splice(index, 1);
            localStorage.setItem("cart", JSON.stringify(cartItems));
            location.reload();
        });

        cartContainer.appendChild(produsDiv);
    });

    // Total general
    const totalDiv = document.createElement("div");
    totalDiv.classList.add("cart-total");
    totalDiv.innerHTML = `<strong>Total general:</strong> ${total.toFixed(2)} RON`;
    cartContainer.appendChild(totalDiv);

    // Butoane finale
    const actionsDiv = document.createElement("div");
    actionsDiv.classList.add("cart-actions");
    actionsDiv.innerHTML = `
        <button id="golesteCos">Golește coșul</button>
        <button id="finalizeazaComanda">Finalizează comanda</button>
    `;
    cartContainer.appendChild(actionsDiv);

    document.getElementById("golesteCos").addEventListener("click", () => {
        localStorage.removeItem("cart");
        location.reload();
    });

    document.getElementById("finalizeazaComanda").addEventListener("click", () => {
        alert("Comanda a fost trimisă cu succes!");
        localStorage.removeItem("cart");
        location.reload();
    });
});
