// Define the API endpoint
const apiUrl = 'https://example.com/api/getAllEmployee';

// Function to fetch data from the API
async function fetchEmployees() {
    const container = document.getElementById('employee-container');
    
    try {
        // Fetch data from the API
        const response = await fetch(apiUrl);

        // Check if the request was successful
        if (!response.ok) {
            throw new Error(`HTTP error! Status: ${response.status}`);
        }

        // Parse the JSON data from the response
        const data = await response.json();

        // Clear the loading message
        container.innerHTML = '';

        // Generate HTML content for the employees
        if (data && data.length > 0) {
            data.forEach(employee => {
                const employeeDiv = document.createElement('div');
                employeeDiv.className = 'employee-item';
                employeeDiv.innerHTML = `
                    <div class="employee-name">${employee.name}</div>
                    <div class="employee-position">${employee.position}</div>
                `;
                container.appendChild(employeeDiv);
            });
        } else {
            container.innerHTML = '<p>No employees found.</p>';
        }
    } catch (error) {
        // Handle any errors that occurred during the fetch
        container.innerHTML = `<p>Error fetching employee data: ${error.message}</p>`;
    }
}

// Call the function to fetch and display employee data
fetchEmployees();
