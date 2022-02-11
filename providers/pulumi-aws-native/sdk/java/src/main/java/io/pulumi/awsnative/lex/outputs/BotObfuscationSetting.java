// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.enums.BotObfuscationSettingObfuscationSettingType;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class BotObfuscationSetting {
    private final BotObfuscationSettingObfuscationSettingType obfuscationSettingType;

    @OutputCustomType.Constructor({"obfuscationSettingType"})
    private BotObfuscationSetting(BotObfuscationSettingObfuscationSettingType obfuscationSettingType) {
        this.obfuscationSettingType = Objects.requireNonNull(obfuscationSettingType);
    }

    public BotObfuscationSettingObfuscationSettingType getObfuscationSettingType() {
        return this.obfuscationSettingType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotObfuscationSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotObfuscationSettingObfuscationSettingType obfuscationSettingType;

        public Builder() {
    	      // Empty
        }

        public Builder(BotObfuscationSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.obfuscationSettingType = defaults.obfuscationSettingType;
        }

        public Builder setObfuscationSettingType(BotObfuscationSettingObfuscationSettingType obfuscationSettingType) {
            this.obfuscationSettingType = Objects.requireNonNull(obfuscationSettingType);
            return this;
        }

        public BotObfuscationSetting build() {
            return new BotObfuscationSetting(obfuscationSettingType);
        }
    }
}
