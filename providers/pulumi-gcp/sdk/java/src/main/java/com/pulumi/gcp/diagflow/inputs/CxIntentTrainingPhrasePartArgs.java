// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxIntentTrainingPhrasePartArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxIntentTrainingPhrasePartArgs Empty = new CxIntentTrainingPhrasePartArgs();

    /**
     * The parameter used to annotate this part of the training phrase. This field is required for annotated parts of the training phrase.
     * 
     */
    @Import(name="parameterId")
    private @Nullable Output<String> parameterId;

    /**
     * @return The parameter used to annotate this part of the training phrase. This field is required for annotated parts of the training phrase.
     * 
     */
    public Optional<Output<String>> parameterId() {
        return Optional.ofNullable(this.parameterId);
    }

    /**
     * The text for this part.
     * 
     */
    @Import(name="text", required=true)
    private Output<String> text;

    /**
     * @return The text for this part.
     * 
     */
    public Output<String> text() {
        return this.text;
    }

    private CxIntentTrainingPhrasePartArgs() {}

    private CxIntentTrainingPhrasePartArgs(CxIntentTrainingPhrasePartArgs $) {
        this.parameterId = $.parameterId;
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxIntentTrainingPhrasePartArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxIntentTrainingPhrasePartArgs $;

        public Builder() {
            $ = new CxIntentTrainingPhrasePartArgs();
        }

        public Builder(CxIntentTrainingPhrasePartArgs defaults) {
            $ = new CxIntentTrainingPhrasePartArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameterId The parameter used to annotate this part of the training phrase. This field is required for annotated parts of the training phrase.
         * 
         * @return builder
         * 
         */
        public Builder parameterId(@Nullable Output<String> parameterId) {
            $.parameterId = parameterId;
            return this;
        }

        /**
         * @param parameterId The parameter used to annotate this part of the training phrase. This field is required for annotated parts of the training phrase.
         * 
         * @return builder
         * 
         */
        public Builder parameterId(String parameterId) {
            return parameterId(Output.of(parameterId));
        }

        /**
         * @param text The text for this part.
         * 
         * @return builder
         * 
         */
        public Builder text(Output<String> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text The text for this part.
         * 
         * @return builder
         * 
         */
        public Builder text(String text) {
            return text(Output.of(text));
        }

        public CxIntentTrainingPhrasePartArgs build() {
            $.text = Objects.requireNonNull($.text, "expected parameter 'text' to be non-null");
            return $;
        }
    }

}
