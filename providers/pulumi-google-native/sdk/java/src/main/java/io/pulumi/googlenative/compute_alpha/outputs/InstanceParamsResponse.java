// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class InstanceParamsResponse {
    /**
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT & PATCH) when empty.
     * 
     */
    private final Map<String,String> resourceManagerTags;

    @OutputCustomType.Constructor({"resourceManagerTags"})
    private InstanceParamsResponse(Map<String,String> resourceManagerTags) {
        this.resourceManagerTags = Objects.requireNonNull(resourceManagerTags);
    }

    /**
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT & PATCH) when empty.
     * 
    */
    public Map<String,String> getResourceManagerTags() {
        return this.resourceManagerTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceParamsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> resourceManagerTags;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceParamsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceManagerTags = defaults.resourceManagerTags;
        }

        public Builder setResourceManagerTags(Map<String,String> resourceManagerTags) {
            this.resourceManagerTags = Objects.requireNonNull(resourceManagerTags);
            return this;
        }
        public InstanceParamsResponse build() {
            return new InstanceParamsResponse(resourceManagerTags);
        }
    }
}