// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DetectorModelPayloadArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelPayloadArgs Empty = new DetectorModelPayloadArgs();

    @InputImport(name="contentExpression", required=true)
    private final Input<String> contentExpression;

    public Input<String> getContentExpression() {
        return this.contentExpression;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public DetectorModelPayloadArgs(
        Input<String> contentExpression,
        Input<String> type) {
        this.contentExpression = Objects.requireNonNull(contentExpression, "expected parameter 'contentExpression' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DetectorModelPayloadArgs() {
        this.contentExpression = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelPayloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> contentExpression;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelPayloadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentExpression = defaults.contentExpression;
    	      this.type = defaults.type;
        }

        public Builder setContentExpression(Input<String> contentExpression) {
            this.contentExpression = Objects.requireNonNull(contentExpression);
            return this;
        }

        public Builder setContentExpression(String contentExpression) {
            this.contentExpression = Input.of(Objects.requireNonNull(contentExpression));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public DetectorModelPayloadArgs build() {
            return new DetectorModelPayloadArgs(contentExpression, type);
        }
    }
}
