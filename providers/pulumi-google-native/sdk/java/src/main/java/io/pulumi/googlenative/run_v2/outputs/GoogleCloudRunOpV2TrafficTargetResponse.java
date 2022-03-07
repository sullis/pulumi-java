// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRunOpV2TrafficTargetResponse {
    /**
     * Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
     * 
     */
    private final Integer percent;
    /**
     * Revision to which to send this portion of traffic, if traffic allocation is by revision.
     * 
     */
    private final String revision;
    /**
     * Indicates a string to be part of the URI to exclusively reference this target.
     * 
     */
    private final String tag;
    /**
     * The allocation type for this traffic target.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"percent","revision","tag","type"})
    private GoogleCloudRunOpV2TrafficTargetResponse(
        Integer percent,
        String revision,
        String tag,
        String type) {
        this.percent = Objects.requireNonNull(percent);
        this.revision = Objects.requireNonNull(revision);
        this.tag = Objects.requireNonNull(tag);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
     * 
    */
    public Integer getPercent() {
        return this.percent;
    }
    /**
     * Revision to which to send this portion of traffic, if traffic allocation is by revision.
     * 
    */
    public String getRevision() {
        return this.revision;
    }
    /**
     * Indicates a string to be part of the URI to exclusively reference this target.
     * 
    */
    public String getTag() {
        return this.tag;
    }
    /**
     * The allocation type for this traffic target.
     * 
    */
    public String getType() {
        return this.type;
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