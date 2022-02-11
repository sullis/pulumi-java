// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLAllowActionArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLBlockActionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebACLDefaultActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLDefaultActionArgs Empty = new WebACLDefaultActionArgs();

    @InputImport(name="allow")
    private final @Nullable Input<WebACLAllowActionArgs> allow;

    public Input<WebACLAllowActionArgs> getAllow() {
        return this.allow == null ? Input.empty() : this.allow;
    }

    @InputImport(name="block")
    private final @Nullable Input<WebACLBlockActionArgs> block;

    public Input<WebACLBlockActionArgs> getBlock() {
        return this.block == null ? Input.empty() : this.block;
    }

    public WebACLDefaultActionArgs(
        @Nullable Input<WebACLAllowActionArgs> allow,
        @Nullable Input<WebACLBlockActionArgs> block) {
        this.allow = allow;
        this.block = block;
    }

    private WebACLDefaultActionArgs() {
        this.allow = Input.empty();
        this.block = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLDefaultActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebACLAllowActionArgs> allow;
        private @Nullable Input<WebACLBlockActionArgs> block;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLDefaultActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
        }

        public Builder setAllow(@Nullable Input<WebACLAllowActionArgs> allow) {
            this.allow = allow;
            return this;
        }

        public Builder setAllow(@Nullable WebACLAllowActionArgs allow) {
            this.allow = Input.ofNullable(allow);
            return this;
        }

        public Builder setBlock(@Nullable Input<WebACLBlockActionArgs> block) {
            this.block = block;
            return this;
        }

        public Builder setBlock(@Nullable WebACLBlockActionArgs block) {
            this.block = Input.ofNullable(block);
            return this;
        }

        public WebACLDefaultActionArgs build() {
            return new WebACLDefaultActionArgs(allow, block);
        }
    }
}
