// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotMultipleValuesSetting;
import io.pulumi.awsnative.lex.outputs.BotObfuscationSetting;
import io.pulumi.awsnative.lex.outputs.BotSlotValueElicitationSetting;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotSlot {
    private final @Nullable String description;
    private final @Nullable BotMultipleValuesSetting multipleValuesSetting;
    private final String name;
    private final @Nullable BotObfuscationSetting obfuscationSetting;
    private final String slotTypeName;
    private final BotSlotValueElicitationSetting valueElicitationSetting;

    @OutputCustomType.Constructor({"description","multipleValuesSetting","name","obfuscationSetting","slotTypeName","valueElicitationSetting"})
    private BotSlot(
        @Nullable String description,
        @Nullable BotMultipleValuesSetting multipleValuesSetting,
        String name,
        @Nullable BotObfuscationSetting obfuscationSetting,
        String slotTypeName,
        BotSlotValueElicitationSetting valueElicitationSetting) {
        this.description = description;
        this.multipleValuesSetting = multipleValuesSetting;
        this.name = Objects.requireNonNull(name);
        this.obfuscationSetting = obfuscationSetting;
        this.slotTypeName = Objects.requireNonNull(slotTypeName);
        this.valueElicitationSetting = Objects.requireNonNull(valueElicitationSetting);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<BotMultipleValuesSetting> getMultipleValuesSetting() {
        return Optional.ofNullable(this.multipleValuesSetting);
    }
    public String getName() {
        return this.name;
    }
    public Optional<BotObfuscationSetting> getObfuscationSetting() {
        return Optional.ofNullable(this.obfuscationSetting);
    }
    public String getSlotTypeName() {
        return this.slotTypeName;
    }
    public BotSlotValueElicitationSetting getValueElicitationSetting() {
        return this.valueElicitationSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlot defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable BotMultipleValuesSetting multipleValuesSetting;
        private String name;
        private @Nullable BotObfuscationSetting obfuscationSetting;
        private String slotTypeName;
        private BotSlotValueElicitationSetting valueElicitationSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.multipleValuesSetting = defaults.multipleValuesSetting;
    	      this.name = defaults.name;
    	      this.obfuscationSetting = defaults.obfuscationSetting;
    	      this.slotTypeName = defaults.slotTypeName;
    	      this.valueElicitationSetting = defaults.valueElicitationSetting;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setMultipleValuesSetting(@Nullable BotMultipleValuesSetting multipleValuesSetting) {
            this.multipleValuesSetting = multipleValuesSetting;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setObfuscationSetting(@Nullable BotObfuscationSetting obfuscationSetting) {
            this.obfuscationSetting = obfuscationSetting;
            return this;
        }

        public Builder setSlotTypeName(String slotTypeName) {
            this.slotTypeName = Objects.requireNonNull(slotTypeName);
            return this;
        }

        public Builder setValueElicitationSetting(BotSlotValueElicitationSetting valueElicitationSetting) {
            this.valueElicitationSetting = Objects.requireNonNull(valueElicitationSetting);
            return this;
        }

        public BotSlot build() {
            return new BotSlot(description, multipleValuesSetting, name, obfuscationSetting, slotTypeName, valueElicitationSetting);
        }
    }
}
