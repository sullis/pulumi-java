// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBotAssociationLexBot extends com.pulumi.resources.InvokeArgs {

    public static final GetBotAssociationLexBot Empty = new GetBotAssociationLexBot();

    /**
     * The Region that the Amazon Lex (V1) bot was created in.
     * 
     */
    @Import(name="lexRegion", required=true)
    private String lexRegion;

    /**
     * @return The Region that the Amazon Lex (V1) bot was created in.
     * 
     */
    public String lexRegion() {
        return this.lexRegion;
    }

    /**
     * The name of the Amazon Lex (V1) bot.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Amazon Lex (V1) bot.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetBotAssociationLexBot() {}

    private GetBotAssociationLexBot(GetBotAssociationLexBot $) {
        this.lexRegion = $.lexRegion;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotAssociationLexBot defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotAssociationLexBot $;

        public Builder() {
            $ = new GetBotAssociationLexBot();
        }

        public Builder(GetBotAssociationLexBot defaults) {
            $ = new GetBotAssociationLexBot(Objects.requireNonNull(defaults));
        }

        /**
         * @param lexRegion The Region that the Amazon Lex (V1) bot was created in.
         * 
         * @return builder
         * 
         */
        public Builder lexRegion(String lexRegion) {
            $.lexRegion = lexRegion;
            return this;
        }

        /**
         * @param name The name of the Amazon Lex (V1) bot.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetBotAssociationLexBot build() {
            $.lexRegion = Objects.requireNonNull($.lexRegion, "expected parameter 'lexRegion' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
