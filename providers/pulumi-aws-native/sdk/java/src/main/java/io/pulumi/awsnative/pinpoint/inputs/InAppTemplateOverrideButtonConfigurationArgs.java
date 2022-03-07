// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.pinpoint.inputs;

import io.pulumi.awsnative.pinpoint.enums.InAppTemplateButtonAction;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InAppTemplateOverrideButtonConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final InAppTemplateOverrideButtonConfigurationArgs Empty = new InAppTemplateOverrideButtonConfigurationArgs();

    @InputImport(name="buttonAction")
      private final @Nullable Input<InAppTemplateButtonAction> buttonAction;

    public Input<InAppTemplateButtonAction> getButtonAction() {
        return this.buttonAction == null ? Input.empty() : this.buttonAction;
    }

    @InputImport(name="link")
      private final @Nullable Input<String> link;

    public Input<String> getLink() {
        return this.link == null ? Input.empty() : this.link;
    }

    public InAppTemplateOverrideButtonConfigurationArgs(
        @Nullable Input<InAppTemplateButtonAction> buttonAction,
        @Nullable Input<String> link) {
        this.buttonAction = buttonAction;
        this.link = link;
    }

    private InAppTemplateOverrideButtonConfigurationArgs() {
        this.buttonAction = Input.empty();
        this.link = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InAppTemplateOverrideButtonConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InAppTemplateButtonAction> buttonAction;
        private @Nullable Input<String> link;

        public Builder() {
    	      // Empty
        }

        public Builder(InAppTemplateOverrideButtonConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttonAction = defaults.buttonAction;
    	      this.link = defaults.link;
        }

        public Builder setButtonAction(@Nullable Input<InAppTemplateButtonAction> buttonAction) {
            this.buttonAction = buttonAction;
            return this;
        }

        public Builder setButtonAction(@Nullable InAppTemplateButtonAction buttonAction) {
            this.buttonAction = Input.ofNullable(buttonAction);
            return this;
        }

        public Builder setLink(@Nullable Input<String> link) {
            this.link = link;
            return this;
        }

        public Builder setLink(@Nullable String link) {
            this.link = Input.ofNullable(link);
            return this;
        }
        public InAppTemplateOverrideButtonConfigurationArgs build() {
            return new InAppTemplateOverrideButtonConfigurationArgs(buttonAction, link);
        }
    }
}