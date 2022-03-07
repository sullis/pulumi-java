// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Properties of a registration assignment.
 * 
 */
public final class RegistrationAssignmentPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistrationAssignmentPropertiesArgs Empty = new RegistrationAssignmentPropertiesArgs();

    /**
     * Fully qualified path of the registration definition.
     * 
     */
    @InputImport(name="registrationDefinitionId", required=true)
      private final Input<String> registrationDefinitionId;

    public Input<String> getRegistrationDefinitionId() {
        return this.registrationDefinitionId;
    }

    public RegistrationAssignmentPropertiesArgs(Input<String> registrationDefinitionId) {
        this.registrationDefinitionId = Objects.requireNonNull(registrationDefinitionId, "expected parameter 'registrationDefinitionId' to be non-null");
    }

    private RegistrationAssignmentPropertiesArgs() {
        this.registrationDefinitionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistrationAssignmentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> registrationDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistrationAssignmentPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registrationDefinitionId = defaults.registrationDefinitionId;
        }

        public Builder setRegistrationDefinitionId(Input<String> registrationDefinitionId) {
            this.registrationDefinitionId = Objects.requireNonNull(registrationDefinitionId);
            return this;
        }

        public Builder setRegistrationDefinitionId(String registrationDefinitionId) {
            this.registrationDefinitionId = Input.of(Objects.requireNonNull(registrationDefinitionId));
            return this;
        }
        public RegistrationAssignmentPropertiesArgs build() {
            return new RegistrationAssignmentPropertiesArgs(registrationDefinitionId);
        }
    }
}