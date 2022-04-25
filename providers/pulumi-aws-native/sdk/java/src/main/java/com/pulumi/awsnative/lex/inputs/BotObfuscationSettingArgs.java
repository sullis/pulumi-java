// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.enums.BotObfuscationSettingObfuscationSettingType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Determines whether Amazon Lex obscures slot values in conversation logs.
 * 
 */
public final class BotObfuscationSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotObfuscationSettingArgs Empty = new BotObfuscationSettingArgs();

    /**
     * Value that determines whether Amazon Lex obscures slot values in conversation logs. The default is to obscure the values.
     * 
     */
    @Import(name="obfuscationSettingType", required=true)
    private Output<BotObfuscationSettingObfuscationSettingType> obfuscationSettingType;

    /**
     * @return Value that determines whether Amazon Lex obscures slot values in conversation logs. The default is to obscure the values.
     * 
     */
    public Output<BotObfuscationSettingObfuscationSettingType> obfuscationSettingType() {
        return this.obfuscationSettingType;
    }

    private BotObfuscationSettingArgs() {}

    private BotObfuscationSettingArgs(BotObfuscationSettingArgs $) {
        this.obfuscationSettingType = $.obfuscationSettingType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotObfuscationSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotObfuscationSettingArgs $;

        public Builder() {
            $ = new BotObfuscationSettingArgs();
        }

        public Builder(BotObfuscationSettingArgs defaults) {
            $ = new BotObfuscationSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param obfuscationSettingType Value that determines whether Amazon Lex obscures slot values in conversation logs. The default is to obscure the values.
         * 
         * @return builder
         * 
         */
        public Builder obfuscationSettingType(Output<BotObfuscationSettingObfuscationSettingType> obfuscationSettingType) {
            $.obfuscationSettingType = obfuscationSettingType;
            return this;
        }

        /**
         * @param obfuscationSettingType Value that determines whether Amazon Lex obscures slot values in conversation logs. The default is to obscure the values.
         * 
         * @return builder
         * 
         */
        public Builder obfuscationSettingType(BotObfuscationSettingObfuscationSettingType obfuscationSettingType) {
            return obfuscationSettingType(Output.of(obfuscationSettingType));
        }

        public BotObfuscationSettingArgs build() {
            $.obfuscationSettingType = Objects.requireNonNull($.obfuscationSettingType, "expected parameter 'obfuscationSettingType' to be non-null");
            return $;
        }
    }

}
