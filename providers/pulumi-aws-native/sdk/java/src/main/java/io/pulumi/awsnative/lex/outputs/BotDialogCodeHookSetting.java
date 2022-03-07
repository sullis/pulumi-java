// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class BotDialogCodeHookSetting {
    private final Boolean enabled;

    @OutputCustomType.Constructor({"enabled"})
    private BotDialogCodeHookSetting(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled);
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotDialogCodeHookSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BotDialogCodeHookSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public BotDialogCodeHookSetting build() {
            return new BotDialogCodeHookSetting(enabled);
        }
    }
}