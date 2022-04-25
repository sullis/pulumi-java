// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FhirServiceAccessPolicyEntryResponse {
    /**
     * @return An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
     */
    private final String objectId;

    @CustomType.Constructor
    private FhirServiceAccessPolicyEntryResponse(@CustomType.Parameter("objectId") String objectId) {
        this.objectId = objectId;
    }

    /**
     * @return An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
     */
    public String objectId() {
        return this.objectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirServiceAccessPolicyEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectId;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirServiceAccessPolicyEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectId = defaults.objectId;
        }

        public Builder objectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }        public FhirServiceAccessPolicyEntryResponse build() {
            return new FhirServiceAccessPolicyEntryResponse(objectId);
        }
    }
}
