// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotFulfillmentUpdatesSpecificationArgs;
import io.pulumi.awsnative.lex.inputs.BotPostFulfillmentStatusSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotFulfillmentCodeHookSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotFulfillmentCodeHookSettingArgs Empty = new BotFulfillmentCodeHookSettingArgs();

    @InputImport(name="enabled", required=true)
    private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    @InputImport(name="fulfillmentUpdatesSpecification")
    private final @Nullable Input<BotFulfillmentUpdatesSpecificationArgs> fulfillmentUpdatesSpecification;

    public Input<BotFulfillmentUpdatesSpecificationArgs> getFulfillmentUpdatesSpecification() {
        return this.fulfillmentUpdatesSpecification == null ? Input.empty() : this.fulfillmentUpdatesSpecification;
    }

    @InputImport(name="postFulfillmentStatusSpecification")
    private final @Nullable Input<BotPostFulfillmentStatusSpecificationArgs> postFulfillmentStatusSpecification;

    public Input<BotPostFulfillmentStatusSpecificationArgs> getPostFulfillmentStatusSpecification() {
        return this.postFulfillmentStatusSpecification == null ? Input.empty() : this.postFulfillmentStatusSpecification;
    }

    public BotFulfillmentCodeHookSettingArgs(
        Input<Boolean> enabled,
        @Nullable Input<BotFulfillmentUpdatesSpecificationArgs> fulfillmentUpdatesSpecification,
        @Nullable Input<BotPostFulfillmentStatusSpecificationArgs> postFulfillmentStatusSpecification) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.fulfillmentUpdatesSpecification = fulfillmentUpdatesSpecification;
        this.postFulfillmentStatusSpecification = postFulfillmentStatusSpecification;
    }

    private BotFulfillmentCodeHookSettingArgs() {
        this.enabled = Input.empty();
        this.fulfillmentUpdatesSpecification = Input.empty();
        this.postFulfillmentStatusSpecification = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotFulfillmentCodeHookSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enabled;
        private @Nullable Input<BotFulfillmentUpdatesSpecificationArgs> fulfillmentUpdatesSpecification;
        private @Nullable Input<BotPostFulfillmentStatusSpecificationArgs> postFulfillmentStatusSpecification;

        public Builder() {
    	      // Empty
        }

        public Builder(BotFulfillmentCodeHookSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.fulfillmentUpdatesSpecification = defaults.fulfillmentUpdatesSpecification;
    	      this.postFulfillmentStatusSpecification = defaults.postFulfillmentStatusSpecification;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public Builder setFulfillmentUpdatesSpecification(@Nullable Input<BotFulfillmentUpdatesSpecificationArgs> fulfillmentUpdatesSpecification) {
            this.fulfillmentUpdatesSpecification = fulfillmentUpdatesSpecification;
            return this;
        }

        public Builder setFulfillmentUpdatesSpecification(@Nullable BotFulfillmentUpdatesSpecificationArgs fulfillmentUpdatesSpecification) {
            this.fulfillmentUpdatesSpecification = Input.ofNullable(fulfillmentUpdatesSpecification);
            return this;
        }

        public Builder setPostFulfillmentStatusSpecification(@Nullable Input<BotPostFulfillmentStatusSpecificationArgs> postFulfillmentStatusSpecification) {
            this.postFulfillmentStatusSpecification = postFulfillmentStatusSpecification;
            return this;
        }

        public Builder setPostFulfillmentStatusSpecification(@Nullable BotPostFulfillmentStatusSpecificationArgs postFulfillmentStatusSpecification) {
            this.postFulfillmentStatusSpecification = Input.ofNullable(postFulfillmentStatusSpecification);
            return this;
        }

        public BotFulfillmentCodeHookSettingArgs build() {
            return new BotFulfillmentCodeHookSettingArgs(enabled, fulfillmentUpdatesSpecification, postFulfillmentStatusSpecification);
        }
    }
}
