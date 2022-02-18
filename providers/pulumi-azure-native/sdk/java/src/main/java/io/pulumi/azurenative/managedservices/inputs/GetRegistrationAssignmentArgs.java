// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistrationAssignmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegistrationAssignmentArgs Empty = new GetRegistrationAssignmentArgs();

    /**
     * Tells whether to return registration definition details also along with registration assignment details.
     * 
     */
    @InputImport(name="expandRegistrationDefinition")
    private final @Nullable Boolean expandRegistrationDefinition;

    public Optional<Boolean> getExpandRegistrationDefinition() {
        return this.expandRegistrationDefinition == null ? Optional.empty() : Optional.ofNullable(this.expandRegistrationDefinition);
    }

    /**
     * Guid of the registration assignment.
     * 
     */
    @InputImport(name="registrationAssignmentId", required=true)
    private final String registrationAssignmentId;

    public String getRegistrationAssignmentId() {
        return this.registrationAssignmentId;
    }

    /**
     * Scope of the resource.
     * 
     */
    @InputImport(name="scope", required=true)
    private final String scope;

    public String getScope() {
        return this.scope;
    }

    public GetRegistrationAssignmentArgs(
        @Nullable Boolean expandRegistrationDefinition,
        String registrationAssignmentId,
        String scope) {
        this.expandRegistrationDefinition = expandRegistrationDefinition;
        this.registrationAssignmentId = Objects.requireNonNull(registrationAssignmentId, "expected parameter 'registrationAssignmentId' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetRegistrationAssignmentArgs() {
        this.expandRegistrationDefinition = null;
        this.registrationAssignmentId = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistrationAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean expandRegistrationDefinition;
        private String registrationAssignmentId;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistrationAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expandRegistrationDefinition = defaults.expandRegistrationDefinition;
    	      this.registrationAssignmentId = defaults.registrationAssignmentId;
    	      this.scope = defaults.scope;
        }

        public Builder setExpandRegistrationDefinition(@Nullable Boolean expandRegistrationDefinition) {
            this.expandRegistrationDefinition = expandRegistrationDefinition;
            return this;
        }

        public Builder setRegistrationAssignmentId(String registrationAssignmentId) {
            this.registrationAssignmentId = Objects.requireNonNull(registrationAssignmentId);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public GetRegistrationAssignmentArgs build() {
            return new GetRegistrationAssignmentArgs(expandRegistrationDefinition, registrationAssignmentId, scope);
        }
    }
}
