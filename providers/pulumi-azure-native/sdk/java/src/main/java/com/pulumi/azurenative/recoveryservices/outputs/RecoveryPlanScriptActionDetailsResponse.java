// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RecoveryPlanScriptActionDetailsResponse {
    /**
     * @return The fabric location.
     * 
     */
    private final String fabricLocation;
    /**
     * @return Gets the type of action details (see RecoveryPlanActionDetailsTypes enum for possible values).
     * Expected value is &#39;ScriptActionDetails&#39;.
     * 
     */
    private final String instanceType;
    /**
     * @return The script path.
     * 
     */
    private final String path;
    /**
     * @return The script timeout.
     * 
     */
    private final @Nullable String timeout;

    @CustomType.Constructor
    private RecoveryPlanScriptActionDetailsResponse(
        @CustomType.Parameter("fabricLocation") String fabricLocation,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("timeout") @Nullable String timeout) {
        this.fabricLocation = fabricLocation;
        this.instanceType = instanceType;
        this.path = path;
        this.timeout = timeout;
    }

    /**
     * @return The fabric location.
     * 
     */
    public String fabricLocation() {
        return this.fabricLocation;
    }
    /**
     * @return Gets the type of action details (see RecoveryPlanActionDetailsTypes enum for possible values).
     * Expected value is &#39;ScriptActionDetails&#39;.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The script path.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The script timeout.
     * 
     */
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanScriptActionDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fabricLocation;
        private String instanceType;
        private String path;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanScriptActionDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricLocation = defaults.fabricLocation;
    	      this.instanceType = defaults.instanceType;
    	      this.path = defaults.path;
    	      this.timeout = defaults.timeout;
        }

        public Builder fabricLocation(String fabricLocation) {
            this.fabricLocation = Objects.requireNonNull(fabricLocation);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }        public RecoveryPlanScriptActionDetailsResponse build() {
            return new RecoveryPlanScriptActionDetailsResponse(fabricLocation, instanceType, path, timeout);
        }
    }
}
