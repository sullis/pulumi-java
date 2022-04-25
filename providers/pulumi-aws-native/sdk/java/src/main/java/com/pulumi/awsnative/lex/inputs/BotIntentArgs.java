// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotDialogCodeHookSettingArgs;
import com.pulumi.awsnative.lex.inputs.BotFulfillmentCodeHookSettingArgs;
import com.pulumi.awsnative.lex.inputs.BotInputContextArgs;
import com.pulumi.awsnative.lex.inputs.BotIntentClosingSettingArgs;
import com.pulumi.awsnative.lex.inputs.BotIntentConfirmationSettingArgs;
import com.pulumi.awsnative.lex.inputs.BotKendraConfigurationArgs;
import com.pulumi.awsnative.lex.inputs.BotOutputContextArgs;
import com.pulumi.awsnative.lex.inputs.BotSampleUtteranceArgs;
import com.pulumi.awsnative.lex.inputs.BotSlotArgs;
import com.pulumi.awsnative.lex.inputs.BotSlotPriorityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An intent represents an action that the user wants to perform. You create a bot to support one or more related intents.
 * 
 */
public final class BotIntentArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotIntentArgs Empty = new BotIntentArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="dialogCodeHook")
    private @Nullable Output<BotDialogCodeHookSettingArgs> dialogCodeHook;

    public Optional<Output<BotDialogCodeHookSettingArgs>> dialogCodeHook() {
        return Optional.ofNullable(this.dialogCodeHook);
    }

    @Import(name="fulfillmentCodeHook")
    private @Nullable Output<BotFulfillmentCodeHookSettingArgs> fulfillmentCodeHook;

    public Optional<Output<BotFulfillmentCodeHookSettingArgs>> fulfillmentCodeHook() {
        return Optional.ofNullable(this.fulfillmentCodeHook);
    }

    @Import(name="inputContexts")
    private @Nullable Output<List<BotInputContextArgs>> inputContexts;

    public Optional<Output<List<BotInputContextArgs>>> inputContexts() {
        return Optional.ofNullable(this.inputContexts);
    }

    @Import(name="intentClosingSetting")
    private @Nullable Output<BotIntentClosingSettingArgs> intentClosingSetting;

    public Optional<Output<BotIntentClosingSettingArgs>> intentClosingSetting() {
        return Optional.ofNullable(this.intentClosingSetting);
    }

    @Import(name="intentConfirmationSetting")
    private @Nullable Output<BotIntentConfirmationSettingArgs> intentConfirmationSetting;

    public Optional<Output<BotIntentConfirmationSettingArgs>> intentConfirmationSetting() {
        return Optional.ofNullable(this.intentConfirmationSetting);
    }

    @Import(name="kendraConfiguration")
    private @Nullable Output<BotKendraConfigurationArgs> kendraConfiguration;

    public Optional<Output<BotKendraConfigurationArgs>> kendraConfiguration() {
        return Optional.ofNullable(this.kendraConfiguration);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="outputContexts")
    private @Nullable Output<List<BotOutputContextArgs>> outputContexts;

    public Optional<Output<List<BotOutputContextArgs>>> outputContexts() {
        return Optional.ofNullable(this.outputContexts);
    }

    @Import(name="parentIntentSignature")
    private @Nullable Output<String> parentIntentSignature;

    public Optional<Output<String>> parentIntentSignature() {
        return Optional.ofNullable(this.parentIntentSignature);
    }

    @Import(name="sampleUtterances")
    private @Nullable Output<List<BotSampleUtteranceArgs>> sampleUtterances;

    public Optional<Output<List<BotSampleUtteranceArgs>>> sampleUtterances() {
        return Optional.ofNullable(this.sampleUtterances);
    }

    @Import(name="slotPriorities")
    private @Nullable Output<List<BotSlotPriorityArgs>> slotPriorities;

    public Optional<Output<List<BotSlotPriorityArgs>>> slotPriorities() {
        return Optional.ofNullable(this.slotPriorities);
    }

    /**
     * List of slots
     * 
     */
    @Import(name="slots")
    private @Nullable Output<List<BotSlotArgs>> slots;

    /**
     * @return List of slots
     * 
     */
    public Optional<Output<List<BotSlotArgs>>> slots() {
        return Optional.ofNullable(this.slots);
    }

    private BotIntentArgs() {}

    private BotIntentArgs(BotIntentArgs $) {
        this.description = $.description;
        this.dialogCodeHook = $.dialogCodeHook;
        this.fulfillmentCodeHook = $.fulfillmentCodeHook;
        this.inputContexts = $.inputContexts;
        this.intentClosingSetting = $.intentClosingSetting;
        this.intentConfirmationSetting = $.intentConfirmationSetting;
        this.kendraConfiguration = $.kendraConfiguration;
        this.name = $.name;
        this.outputContexts = $.outputContexts;
        this.parentIntentSignature = $.parentIntentSignature;
        this.sampleUtterances = $.sampleUtterances;
        this.slotPriorities = $.slotPriorities;
        this.slots = $.slots;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotIntentArgs $;

        public Builder() {
            $ = new BotIntentArgs();
        }

        public Builder(BotIntentArgs defaults) {
            $ = new BotIntentArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder dialogCodeHook(@Nullable Output<BotDialogCodeHookSettingArgs> dialogCodeHook) {
            $.dialogCodeHook = dialogCodeHook;
            return this;
        }

        public Builder dialogCodeHook(BotDialogCodeHookSettingArgs dialogCodeHook) {
            return dialogCodeHook(Output.of(dialogCodeHook));
        }

        public Builder fulfillmentCodeHook(@Nullable Output<BotFulfillmentCodeHookSettingArgs> fulfillmentCodeHook) {
            $.fulfillmentCodeHook = fulfillmentCodeHook;
            return this;
        }

        public Builder fulfillmentCodeHook(BotFulfillmentCodeHookSettingArgs fulfillmentCodeHook) {
            return fulfillmentCodeHook(Output.of(fulfillmentCodeHook));
        }

        public Builder inputContexts(@Nullable Output<List<BotInputContextArgs>> inputContexts) {
            $.inputContexts = inputContexts;
            return this;
        }

        public Builder inputContexts(List<BotInputContextArgs> inputContexts) {
            return inputContexts(Output.of(inputContexts));
        }

        public Builder inputContexts(BotInputContextArgs... inputContexts) {
            return inputContexts(List.of(inputContexts));
        }

        public Builder intentClosingSetting(@Nullable Output<BotIntentClosingSettingArgs> intentClosingSetting) {
            $.intentClosingSetting = intentClosingSetting;
            return this;
        }

        public Builder intentClosingSetting(BotIntentClosingSettingArgs intentClosingSetting) {
            return intentClosingSetting(Output.of(intentClosingSetting));
        }

        public Builder intentConfirmationSetting(@Nullable Output<BotIntentConfirmationSettingArgs> intentConfirmationSetting) {
            $.intentConfirmationSetting = intentConfirmationSetting;
            return this;
        }

        public Builder intentConfirmationSetting(BotIntentConfirmationSettingArgs intentConfirmationSetting) {
            return intentConfirmationSetting(Output.of(intentConfirmationSetting));
        }

        public Builder kendraConfiguration(@Nullable Output<BotKendraConfigurationArgs> kendraConfiguration) {
            $.kendraConfiguration = kendraConfiguration;
            return this;
        }

        public Builder kendraConfiguration(BotKendraConfigurationArgs kendraConfiguration) {
            return kendraConfiguration(Output.of(kendraConfiguration));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder outputContexts(@Nullable Output<List<BotOutputContextArgs>> outputContexts) {
            $.outputContexts = outputContexts;
            return this;
        }

        public Builder outputContexts(List<BotOutputContextArgs> outputContexts) {
            return outputContexts(Output.of(outputContexts));
        }

        public Builder outputContexts(BotOutputContextArgs... outputContexts) {
            return outputContexts(List.of(outputContexts));
        }

        public Builder parentIntentSignature(@Nullable Output<String> parentIntentSignature) {
            $.parentIntentSignature = parentIntentSignature;
            return this;
        }

        public Builder parentIntentSignature(String parentIntentSignature) {
            return parentIntentSignature(Output.of(parentIntentSignature));
        }

        public Builder sampleUtterances(@Nullable Output<List<BotSampleUtteranceArgs>> sampleUtterances) {
            $.sampleUtterances = sampleUtterances;
            return this;
        }

        public Builder sampleUtterances(List<BotSampleUtteranceArgs> sampleUtterances) {
            return sampleUtterances(Output.of(sampleUtterances));
        }

        public Builder sampleUtterances(BotSampleUtteranceArgs... sampleUtterances) {
            return sampleUtterances(List.of(sampleUtterances));
        }

        public Builder slotPriorities(@Nullable Output<List<BotSlotPriorityArgs>> slotPriorities) {
            $.slotPriorities = slotPriorities;
            return this;
        }

        public Builder slotPriorities(List<BotSlotPriorityArgs> slotPriorities) {
            return slotPriorities(Output.of(slotPriorities));
        }

        public Builder slotPriorities(BotSlotPriorityArgs... slotPriorities) {
            return slotPriorities(List.of(slotPriorities));
        }

        /**
         * @param slots List of slots
         * 
         * @return builder
         * 
         */
        public Builder slots(@Nullable Output<List<BotSlotArgs>> slots) {
            $.slots = slots;
            return this;
        }

        /**
         * @param slots List of slots
         * 
         * @return builder
         * 
         */
        public Builder slots(List<BotSlotArgs> slots) {
            return slots(Output.of(slots));
        }

        /**
         * @param slots List of slots
         * 
         * @return builder
         * 
         */
        public Builder slots(BotSlotArgs... slots) {
            return slots(List.of(slots));
        }

        public BotIntentArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
