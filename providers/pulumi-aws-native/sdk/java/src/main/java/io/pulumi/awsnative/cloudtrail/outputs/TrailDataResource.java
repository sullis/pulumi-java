// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudtrail.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class TrailDataResource {
    /**
     * The resource type in which you want to log data events. You can specify AWS::S3::Object or AWS::Lambda::Function resources.
     * 
     */
    private final String type;
    /**
     * An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.
     * 
     */
    private final @Nullable List<String> values;

    @OutputCustomType.Constructor({"type","values"})
    private TrailDataResource(
        String type,
        @Nullable List<String> values) {
        this.type = Objects.requireNonNull(type);
        this.values = values;
    }

    /**
     * The resource type in which you want to log data events. You can specify AWS::S3::Object or AWS::Lambda::Function resources.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.
     * 
    */
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailDataResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailDataResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public TrailDataResource build() {
            return new TrailDataResource(type, values);
        }
    }
}