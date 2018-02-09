// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
// TembooSession session = new TembooSession("accountName", "myFirstApp", "abc123xxxxxxxxxxxxxx");

GeocodeByAddress geocodeByAddressChoreo = new GeocodeByAddress(session);

// Get an InputSet object for the choreo
GeocodeByAddressInputSet geocodeByAddressInputs = geocodeByAddressChoreo.newInputSet();

// Set inputs

// Execute Choreo
GeocodeByAddressResultSet geocodeByAddressResults = geocodeByAddressChoreo.execute(geocodeByAddressInputs);