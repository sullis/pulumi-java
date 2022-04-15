// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outposts.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOutpostsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOutpostsArgs Empty = new GetOutpostsArgs();

    /**
     * Availability Zone name.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable String availabilityZone;

    public Optional<String> availabilityZone() {
        return this.availabilityZone == null ? Optional.empty() : Optional.ofNullable(this.availabilityZone);
    }

    /**
     * Availability Zone identifier.
     * 
     */
    @Import(name="availabilityZoneId")
      private final @Nullable String availabilityZoneId;

    public Optional<String> availabilityZoneId() {
        return this.availabilityZoneId == null ? Optional.empty() : Optional.ofNullable(this.availabilityZoneId);
    }

    /**
     * AWS Account identifier of the Outpost owner.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable String ownerId;

    public Optional<String> ownerId() {
        return this.ownerId == null ? Optional.empty() : Optional.ofNullable(this.ownerId);
    }

    /**
     * Site identifier.
     * 
     */
    @Import(name="siteId")
      private final @Nullable String siteId;

    public Optional<String> siteId() {
        return this.siteId == null ? Optional.empty() : Optional.ofNullable(this.siteId);
    }

    public GetOutpostsArgs(
        @Nullable String availabilityZone,
        @Nullable String availabilityZoneId,
        @Nullable String ownerId,
        @Nullable String siteId) {
        this.availabilityZone = availabilityZone;
        this.availabilityZoneId = availabilityZoneId;
        this.ownerId = ownerId;
        this.siteId = siteId;
    }

    private GetOutpostsArgs() {
        this.availabilityZone = null;
        this.availabilityZoneId = null;
        this.ownerId = null;
        this.siteId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOutpostsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable String availabilityZoneId;
        private @Nullable String ownerId;
        private @Nullable String siteId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOutpostsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.availabilityZoneId = defaults.availabilityZoneId;
    	      this.ownerId = defaults.ownerId;
    	      this.siteId = defaults.siteId;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZoneId(@Nullable String availabilityZoneId) {
            this.availabilityZoneId = availabilityZoneId;
            return this;
        }
        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Builder siteId(@Nullable String siteId) {
            this.siteId = siteId;
            return this;
        }        public GetOutpostsArgs build() {
            return new GetOutpostsArgs(availabilityZone, availabilityZoneId, ownerId, siteId);
        }
    }
}
