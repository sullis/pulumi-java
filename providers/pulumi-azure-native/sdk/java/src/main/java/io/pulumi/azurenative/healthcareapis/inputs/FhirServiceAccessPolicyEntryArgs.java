// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An access policy entry.
 * 
 */
public final class FhirServiceAccessPolicyEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirServiceAccessPolicyEntryArgs Empty = new FhirServiceAccessPolicyEntryArgs();

    /**
     * An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
     */
    @InputImport(name="objectId", required=true)
    private final Input<String> objectId;

    public Input<String> getObjectId() {
        return this.objectId;
    }

    public FhirServiceAccessPolicyEntryArgs(Input<String> objectId) {
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
    }

    private FhirServiceAccessPolicyEntryArgs() {
        this.objectId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirServiceAccessPolicyEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> objectId;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirServiceAccessPolicyEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectId = defaults.objectId;
        }

        public Builder setObjectId(Input<String> objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setObjectId(String objectId) {
            this.objectId = Input.of(Objects.requireNonNull(objectId));
            return this;
        }

        public FhirServiceAccessPolicyEntryArgs build() {
            return new FhirServiceAccessPolicyEntryArgs(objectId);
        }
    }
}
