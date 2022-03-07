// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTrafficGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTrafficGetArgs Empty = new ServiceTrafficGetArgs();

    /**
     * LatestRevision may be optionally provided to indicate that the latest ready
     * Revision of the Configuration should be used for this traffic target. When
     * provided LatestRevision must be true if RevisionName is empty; it must be
     * false when RevisionName is non-empty.
     * 
     */
    @InputImport(name="latestRevision")
      private final @Nullable Input<Boolean> latestRevision;

    public Input<Boolean> getLatestRevision() {
        return this.latestRevision == null ? Input.empty() : this.latestRevision;
    }

    /**
     * Percent specifies percent of the traffic to this Revision or Configuration.
     * 
     */
    @InputImport(name="percent", required=true)
      private final Input<Integer> percent;

    public Input<Integer> getPercent() {
        return this.percent;
    }

    /**
     * RevisionName of a specific revision to which to send this portion of traffic.
     * 
     */
    @InputImport(name="revisionName")
      private final @Nullable Input<String> revisionName;

    public Input<String> getRevisionName() {
        return this.revisionName == null ? Input.empty() : this.revisionName;
    }

    public ServiceTrafficGetArgs(
        @Nullable Input<Boolean> latestRevision,
        Input<Integer> percent,
        @Nullable Input<String> revisionName) {
        this.latestRevision = latestRevision;
        this.percent = Objects.requireNonNull(percent, "expected parameter 'percent' to be non-null");
        this.revisionName = revisionName;
    }

    private ServiceTrafficGetArgs() {
        this.latestRevision = Input.empty();
        this.percent = Input.empty();
        this.revisionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTrafficGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> latestRevision;
        private Input<Integer> percent;
        private @Nullable Input<String> revisionName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTrafficGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latestRevision = defaults.latestRevision;
    	      this.percent = defaults.percent;
    	      this.revisionName = defaults.revisionName;
        }

        public Builder setLatestRevision(@Nullable Input<Boolean> latestRevision) {
            this.latestRevision = latestRevision;
            return this;
        }

        public Builder setLatestRevision(@Nullable Boolean latestRevision) {
            this.latestRevision = Input.ofNullable(latestRevision);
            return this;
        }

        public Builder setPercent(Input<Integer> percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }

        public Builder setPercent(Integer percent) {
            this.percent = Input.of(Objects.requireNonNull(percent));
            return this;
        }

        public Builder setRevisionName(@Nullable Input<String> revisionName) {
            this.revisionName = revisionName;
            return this;
        }

        public Builder setRevisionName(@Nullable String revisionName) {
            this.revisionName = Input.ofNullable(revisionName);
            return this;
        }
        public ServiceTrafficGetArgs build() {
            return new ServiceTrafficGetArgs(latestRevision, percent, revisionName);
        }
    }
}