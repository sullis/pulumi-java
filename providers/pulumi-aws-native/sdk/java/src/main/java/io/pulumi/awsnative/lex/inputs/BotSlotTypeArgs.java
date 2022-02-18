// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotExternalSourceSettingArgs;
import io.pulumi.awsnative.lex.inputs.BotSlotTypeValueArgs;
import io.pulumi.awsnative.lex.inputs.BotSlotValueSelectionSettingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A custom, extended built-in or a grammar slot type.
 * 
 */
public final class BotSlotTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotSlotTypeArgs Empty = new BotSlotTypeArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="externalSourceSetting")
    private final @Nullable Input<BotExternalSourceSettingArgs> externalSourceSetting;

    public Input<BotExternalSourceSettingArgs> getExternalSourceSetting() {
        return this.externalSourceSetting == null ? Input.empty() : this.externalSourceSetting;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="parentSlotTypeSignature")
    private final @Nullable Input<String> parentSlotTypeSignature;

    public Input<String> getParentSlotTypeSignature() {
        return this.parentSlotTypeSignature == null ? Input.empty() : this.parentSlotTypeSignature;
    }

    @InputImport(name="slotTypeValues")
    private final @Nullable Input<List<BotSlotTypeValueArgs>> slotTypeValues;

    public Input<List<BotSlotTypeValueArgs>> getSlotTypeValues() {
        return this.slotTypeValues == null ? Input.empty() : this.slotTypeValues;
    }

    @InputImport(name="valueSelectionSetting")
    private final @Nullable Input<BotSlotValueSelectionSettingArgs> valueSelectionSetting;

    public Input<BotSlotValueSelectionSettingArgs> getValueSelectionSetting() {
        return this.valueSelectionSetting == null ? Input.empty() : this.valueSelectionSetting;
    }

    public BotSlotTypeArgs(
        @Nullable Input<String> description,
        @Nullable Input<BotExternalSourceSettingArgs> externalSourceSetting,
        Input<String> name,
        @Nullable Input<String> parentSlotTypeSignature,
        @Nullable Input<List<BotSlotTypeValueArgs>> slotTypeValues,
        @Nullable Input<BotSlotValueSelectionSettingArgs> valueSelectionSetting) {
        this.description = description;
        this.externalSourceSetting = externalSourceSetting;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parentSlotTypeSignature = parentSlotTypeSignature;
        this.slotTypeValues = slotTypeValues;
        this.valueSelectionSetting = valueSelectionSetting;
    }

    private BotSlotTypeArgs() {
        this.description = Input.empty();
        this.externalSourceSetting = Input.empty();
        this.name = Input.empty();
        this.parentSlotTypeSignature = Input.empty();
        this.slotTypeValues = Input.empty();
        this.valueSelectionSetting = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlotTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<BotExternalSourceSettingArgs> externalSourceSetting;
        private Input<String> name;
        private @Nullable Input<String> parentSlotTypeSignature;
        private @Nullable Input<List<BotSlotTypeValueArgs>> slotTypeValues;
        private @Nullable Input<BotSlotValueSelectionSettingArgs> valueSelectionSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlotTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.externalSourceSetting = defaults.externalSourceSetting;
    	      this.name = defaults.name;
    	      this.parentSlotTypeSignature = defaults.parentSlotTypeSignature;
    	      this.slotTypeValues = defaults.slotTypeValues;
    	      this.valueSelectionSetting = defaults.valueSelectionSetting;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExternalSourceSetting(@Nullable Input<BotExternalSourceSettingArgs> externalSourceSetting) {
            this.externalSourceSetting = externalSourceSetting;
            return this;
        }

        public Builder setExternalSourceSetting(@Nullable BotExternalSourceSettingArgs externalSourceSetting) {
            this.externalSourceSetting = Input.ofNullable(externalSourceSetting);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setParentSlotTypeSignature(@Nullable Input<String> parentSlotTypeSignature) {
            this.parentSlotTypeSignature = parentSlotTypeSignature;
            return this;
        }

        public Builder setParentSlotTypeSignature(@Nullable String parentSlotTypeSignature) {
            this.parentSlotTypeSignature = Input.ofNullable(parentSlotTypeSignature);
            return this;
        }

        public Builder setSlotTypeValues(@Nullable Input<List<BotSlotTypeValueArgs>> slotTypeValues) {
            this.slotTypeValues = slotTypeValues;
            return this;
        }

        public Builder setSlotTypeValues(@Nullable List<BotSlotTypeValueArgs> slotTypeValues) {
            this.slotTypeValues = Input.ofNullable(slotTypeValues);
            return this;
        }

        public Builder setValueSelectionSetting(@Nullable Input<BotSlotValueSelectionSettingArgs> valueSelectionSetting) {
            this.valueSelectionSetting = valueSelectionSetting;
            return this;
        }

        public Builder setValueSelectionSetting(@Nullable BotSlotValueSelectionSettingArgs valueSelectionSetting) {
            this.valueSelectionSetting = Input.ofNullable(valueSelectionSetting);
            return this;
        }

        public BotSlotTypeArgs build() {
            return new BotSlotTypeArgs(description, externalSourceSetting, name, parentSlotTypeSignature, slotTypeValues, valueSelectionSetting);
        }
    }
}
