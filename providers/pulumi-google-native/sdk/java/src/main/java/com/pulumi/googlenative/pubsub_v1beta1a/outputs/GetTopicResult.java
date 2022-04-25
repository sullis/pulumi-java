// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub_v1beta1a.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTopicResult {
    /**
     * @return Name of the topic.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetTopicResult(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * @return Name of the topic.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTopicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetTopicResult build() {
            return new GetTopicResult(name);
        }
    }
}
