// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotDialogCodeHookSetting;
import io.pulumi.awsnative.lex.outputs.BotFulfillmentCodeHookSetting;
import io.pulumi.awsnative.lex.outputs.BotInputContext;
import io.pulumi.awsnative.lex.outputs.BotIntentClosingSetting;
import io.pulumi.awsnative.lex.outputs.BotIntentConfirmationSetting;
import io.pulumi.awsnative.lex.outputs.BotKendraConfiguration;
import io.pulumi.awsnative.lex.outputs.BotOutputContext;
import io.pulumi.awsnative.lex.outputs.BotSampleUtterance;
import io.pulumi.awsnative.lex.outputs.BotSlot;
import io.pulumi.awsnative.lex.outputs.BotSlotPriority;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotIntent {
    private final @Nullable String description;
    private final @Nullable BotDialogCodeHookSetting dialogCodeHook;
    private final @Nullable BotFulfillmentCodeHookSetting fulfillmentCodeHook;
    private final @Nullable List<BotInputContext> inputContexts;
    private final @Nullable BotIntentClosingSetting intentClosingSetting;
    private final @Nullable BotIntentConfirmationSetting intentConfirmationSetting;
    private final @Nullable BotKendraConfiguration kendraConfiguration;
    private final String name;
    private final @Nullable List<BotOutputContext> outputContexts;
    private final @Nullable String parentIntentSignature;
    private final @Nullable List<BotSampleUtterance> sampleUtterances;
    private final @Nullable List<BotSlotPriority> slotPriorities;
    private final @Nullable List<BotSlot> slots;

    @OutputCustomType.Constructor({"description","dialogCodeHook","fulfillmentCodeHook","inputContexts","intentClosingSetting","intentConfirmationSetting","kendraConfiguration","name","outputContexts","parentIntentSignature","sampleUtterances","slotPriorities","slots"})
    private BotIntent(
        @Nullable String description,
        @Nullable BotDialogCodeHookSetting dialogCodeHook,
        @Nullable BotFulfillmentCodeHookSetting fulfillmentCodeHook,
        @Nullable List<BotInputContext> inputContexts,
        @Nullable BotIntentClosingSetting intentClosingSetting,
        @Nullable BotIntentConfirmationSetting intentConfirmationSetting,
        @Nullable BotKendraConfiguration kendraConfiguration,
        String name,
        @Nullable List<BotOutputContext> outputContexts,
        @Nullable String parentIntentSignature,
        @Nullable List<BotSampleUtterance> sampleUtterances,
        @Nullable List<BotSlotPriority> slotPriorities,
        @Nullable List<BotSlot> slots) {
        this.description = description;
        this.dialogCodeHook = dialogCodeHook;
        this.fulfillmentCodeHook = fulfillmentCodeHook;
        this.inputContexts = inputContexts;
        this.intentClosingSetting = intentClosingSetting;
        this.intentConfirmationSetting = intentConfirmationSetting;
        this.kendraConfiguration = kendraConfiguration;
        this.name = Objects.requireNonNull(name);
        this.outputContexts = outputContexts;
        this.parentIntentSignature = parentIntentSignature;
        this.sampleUtterances = sampleUtterances;
        this.slotPriorities = slotPriorities;
        this.slots = slots;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<BotDialogCodeHookSetting> getDialogCodeHook() {
        return Optional.ofNullable(this.dialogCodeHook);
    }
    public Optional<BotFulfillmentCodeHookSetting> getFulfillmentCodeHook() {
        return Optional.ofNullable(this.fulfillmentCodeHook);
    }
    public List<BotInputContext> getInputContexts() {
        return this.inputContexts == null ? List.of() : this.inputContexts;
    }
    public Optional<BotIntentClosingSetting> getIntentClosingSetting() {
        return Optional.ofNullable(this.intentClosingSetting);
    }
    public Optional<BotIntentConfirmationSetting> getIntentConfirmationSetting() {
        return Optional.ofNullable(this.intentConfirmationSetting);
    }
    public Optional<BotKendraConfiguration> getKendraConfiguration() {
        return Optional.ofNullable(this.kendraConfiguration);
    }
    public String getName() {
        return this.name;
    }
    public List<BotOutputContext> getOutputContexts() {
        return this.outputContexts == null ? List.of() : this.outputContexts;
    }
    public Optional<String> getParentIntentSignature() {
        return Optional.ofNullable(this.parentIntentSignature);
    }
    public List<BotSampleUtterance> getSampleUtterances() {
        return this.sampleUtterances == null ? List.of() : this.sampleUtterances;
    }
    public List<BotSlotPriority> getSlotPriorities() {
        return this.slotPriorities == null ? List.of() : this.slotPriorities;
    }
    public List<BotSlot> getSlots() {
        return this.slots == null ? List.of() : this.slots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotIntent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable BotDialogCodeHookSetting dialogCodeHook;
        private @Nullable BotFulfillmentCodeHookSetting fulfillmentCodeHook;
        private @Nullable List<BotInputContext> inputContexts;
        private @Nullable BotIntentClosingSetting intentClosingSetting;
        private @Nullable BotIntentConfirmationSetting intentConfirmationSetting;
        private @Nullable BotKendraConfiguration kendraConfiguration;
        private String name;
        private @Nullable List<BotOutputContext> outputContexts;
        private @Nullable String parentIntentSignature;
        private @Nullable List<BotSampleUtterance> sampleUtterances;
        private @Nullable List<BotSlotPriority> slotPriorities;
        private @Nullable List<BotSlot> slots;

        public Builder() {
    	      // Empty
        }

        public Builder(BotIntent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dialogCodeHook = defaults.dialogCodeHook;
    	      this.fulfillmentCodeHook = defaults.fulfillmentCodeHook;
    	      this.inputContexts = defaults.inputContexts;
    	      this.intentClosingSetting = defaults.intentClosingSetting;
    	      this.intentConfirmationSetting = defaults.intentConfirmationSetting;
    	      this.kendraConfiguration = defaults.kendraConfiguration;
    	      this.name = defaults.name;
    	      this.outputContexts = defaults.outputContexts;
    	      this.parentIntentSignature = defaults.parentIntentSignature;
    	      this.sampleUtterances = defaults.sampleUtterances;
    	      this.slotPriorities = defaults.slotPriorities;
    	      this.slots = defaults.slots;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDialogCodeHook(@Nullable BotDialogCodeHookSetting dialogCodeHook) {
            this.dialogCodeHook = dialogCodeHook;
            return this;
        }

        public Builder setFulfillmentCodeHook(@Nullable BotFulfillmentCodeHookSetting fulfillmentCodeHook) {
            this.fulfillmentCodeHook = fulfillmentCodeHook;
            return this;
        }

        public Builder setInputContexts(@Nullable List<BotInputContext> inputContexts) {
            this.inputContexts = inputContexts;
            return this;
        }

        public Builder setIntentClosingSetting(@Nullable BotIntentClosingSetting intentClosingSetting) {
            this.intentClosingSetting = intentClosingSetting;
            return this;
        }

        public Builder setIntentConfirmationSetting(@Nullable BotIntentConfirmationSetting intentConfirmationSetting) {
            this.intentConfirmationSetting = intentConfirmationSetting;
            return this;
        }

        public Builder setKendraConfiguration(@Nullable BotKendraConfiguration kendraConfiguration) {
            this.kendraConfiguration = kendraConfiguration;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputContexts(@Nullable List<BotOutputContext> outputContexts) {
            this.outputContexts = outputContexts;
            return this;
        }

        public Builder setParentIntentSignature(@Nullable String parentIntentSignature) {
            this.parentIntentSignature = parentIntentSignature;
            return this;
        }

        public Builder setSampleUtterances(@Nullable List<BotSampleUtterance> sampleUtterances) {
            this.sampleUtterances = sampleUtterances;
            return this;
        }

        public Builder setSlotPriorities(@Nullable List<BotSlotPriority> slotPriorities) {
            this.slotPriorities = slotPriorities;
            return this;
        }

        public Builder setSlots(@Nullable List<BotSlot> slots) {
            this.slots = slots;
            return this;
        }

        public BotIntent build() {
            return new BotIntent(description, dialogCodeHook, fulfillmentCodeHook, inputContexts, intentClosingSetting, intentConfirmationSetting, kendraConfiguration, name, outputContexts, parentIntentSignature, sampleUtterances, slotPriorities, slots);
        }
    }
}
