// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLTextTransformationType;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Text Transformation on the Search String before match.
 * 
 */
public final class WebACLTextTransformation extends io.pulumi.resources.InvokeArgs {

    public static final WebACLTextTransformation Empty = new WebACLTextTransformation();

    @Import(name="priority", required=true)
      private final Integer priority;

    public Integer priority() {
        return this.priority;
    }

    @Import(name="type", required=true)
      private final WebACLTextTransformationType type;

    public WebACLTextTransformationType type() {
        return this.type;
    }

    public WebACLTextTransformation(
        Integer priority,
        WebACLTextTransformationType type) {
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private WebACLTextTransformation() {
        this.priority = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLTextTransformation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer priority;
        private WebACLTextTransformationType type;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLTextTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
        }

        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder type(WebACLTextTransformationType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public WebACLTextTransformation build() {
            return new WebACLTextTransformation(priority, type);
        }
    }
}
