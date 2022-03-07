// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.secretmanager_v1.outputs.AutomaticResponse;
import io.pulumi.googlenative.secretmanager_v1.outputs.UserManagedResponse;
import java.util.Objects;

@OutputCustomType
public final class ReplicationResponse {
    /**
     * The Secret will automatically be replicated without any restrictions.
     * 
     */
    private final AutomaticResponse automatic;
    /**
     * The Secret will only be replicated into the locations specified.
     * 
     */
    private final UserManagedResponse userManaged;

    @OutputCustomType.Constructor({"automatic","userManaged"})
    private ReplicationResponse(
        AutomaticResponse automatic,
        UserManagedResponse userManaged) {
        this.automatic = Objects.requireNonNull(automatic);
        this.userManaged = Objects.requireNonNull(userManaged);
    }

    /**
     * The Secret will automatically be replicated without any restrictions.
     * 
    */
    public AutomaticResponse getAutomatic() {
        return this.automatic;
    }
    /**
     * The Secret will only be replicated into the locations specified.
     * 
    */
    public UserManagedResponse getUserManaged() {
        return this.userManaged;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomaticResponse automatic;
        private UserManagedResponse userManaged;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatic = defaults.automatic;
    	      this.userManaged = defaults.userManaged;
        }

        public Builder setAutomatic(AutomaticResponse automatic) {
            this.automatic = Objects.requireNonNull(automatic);
            return this;
        }

        public Builder setUserManaged(UserManagedResponse userManaged) {
            this.userManaged = Objects.requireNonNull(userManaged);
            return this;
        }
        public ReplicationResponse build() {
            return new ReplicationResponse(automatic, userManaged);
        }
    }
}