// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Holds a single traffic routing entry for the Service. Allocations can be done to a specific Revision name, or pointing to the latest Ready Revision.
 * 
 */
public final class GoogleCloudRunOpV2TrafficTargetResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2TrafficTargetResponse Empty = new GoogleCloudRunOpV2TrafficTargetResponse();

    /**
     * Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
     * 
     */
    @InputImport(name="percent", required=true)
      private final Integer percent;

    public Integer getPercent() {
        return this.percent;
    }

    /**
     * Revision to which to send this portion of traffic, if traffic allocation is by revision.
     * 
     */
    @InputImport(name="revision", required=true)
      private final String revision;

    public String getRevision() {
        return this.revision;
    }

    /**
     * Indicates a string to be part of the URI to exclusively reference this target.
     * 
     */
    @InputImport(name="tag", required=true)
      private final String tag;

    public String getTag() {
        return this.tag;
    }

    /**
     * The allocation type for this traffic target.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GoogleCloudRunOpV2TrafficTargetResponse(
        Integer percent,
        String revision,
        String tag,
        String type) {
        this.percent = Objects.requireNonNull(percent, "expected parameter 'percent' to be non-null");
        this.revision = Objects.requireNonNull(revision, "expected parameter 'revision' to be non-null");
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudRunOpV2TrafficTargetResponse() {
        this.percent = null;
        this.revision = null;
        this.tag = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2TrafficTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer percent;
        private String revision;
        private String tag;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2TrafficTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percent = defaults.percent;
    	      this.revision = defaults.revision;
    	      this.tag = defaults.tag;
    	      this.type = defaults.type;
        }

        public Builder setPercent(Integer percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }

        public Builder setRevision(String revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GoogleCloudRunOpV2TrafficTargetResponse build() {
            return new GoogleCloudRunOpV2TrafficTargetResponse(percent, revision, tag, type);
        }
    }
}