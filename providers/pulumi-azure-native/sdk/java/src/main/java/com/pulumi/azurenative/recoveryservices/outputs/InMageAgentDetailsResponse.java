// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InMageAgentDetailsResponse {
    /**
     * @return Agent expiry date.
     * 
     */
    private final @Nullable String agentExpiryDate;
    /**
     * @return A value indicating whether installed agent needs to be updated.
     * 
     */
    private final @Nullable String agentUpdateStatus;
    /**
     * @return The agent version.
     * 
     */
    private final @Nullable String agentVersion;
    /**
     * @return A value indicating whether reboot is required after update is applied.
     * 
     */
    private final @Nullable String postUpdateRebootStatus;

    @CustomType.Constructor
    private InMageAgentDetailsResponse(
        @CustomType.Parameter("agentExpiryDate") @Nullable String agentExpiryDate,
        @CustomType.Parameter("agentUpdateStatus") @Nullable String agentUpdateStatus,
        @CustomType.Parameter("agentVersion") @Nullable String agentVersion,
        @CustomType.Parameter("postUpdateRebootStatus") @Nullable String postUpdateRebootStatus) {
        this.agentExpiryDate = agentExpiryDate;
        this.agentUpdateStatus = agentUpdateStatus;
        this.agentVersion = agentVersion;
        this.postUpdateRebootStatus = postUpdateRebootStatus;
    }

    /**
     * @return Agent expiry date.
     * 
     */
    public Optional<String> agentExpiryDate() {
        return Optional.ofNullable(this.agentExpiryDate);
    }
    /**
     * @return A value indicating whether installed agent needs to be updated.
     * 
     */
    public Optional<String> agentUpdateStatus() {
        return Optional.ofNullable(this.agentUpdateStatus);
    }
    /**
     * @return The agent version.
     * 
     */
    public Optional<String> agentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }
    /**
     * @return A value indicating whether reboot is required after update is applied.
     * 
     */
    public Optional<String> postUpdateRebootStatus() {
        return Optional.ofNullable(this.postUpdateRebootStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageAgentDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentExpiryDate;
        private @Nullable String agentUpdateStatus;
        private @Nullable String agentVersion;
        private @Nullable String postUpdateRebootStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageAgentDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentExpiryDate = defaults.agentExpiryDate;
    	      this.agentUpdateStatus = defaults.agentUpdateStatus;
    	      this.agentVersion = defaults.agentVersion;
    	      this.postUpdateRebootStatus = defaults.postUpdateRebootStatus;
        }

        public Builder agentExpiryDate(@Nullable String agentExpiryDate) {
            this.agentExpiryDate = agentExpiryDate;
            return this;
        }
        public Builder agentUpdateStatus(@Nullable String agentUpdateStatus) {
            this.agentUpdateStatus = agentUpdateStatus;
            return this;
        }
        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public Builder postUpdateRebootStatus(@Nullable String postUpdateRebootStatus) {
            this.postUpdateRebootStatus = postUpdateRebootStatus;
            return this;
        }        public InMageAgentDetailsResponse build() {
            return new InMageAgentDetailsResponse(agentExpiryDate, agentUpdateStatus, agentVersion, postUpdateRebootStatus);
        }
    }
}
