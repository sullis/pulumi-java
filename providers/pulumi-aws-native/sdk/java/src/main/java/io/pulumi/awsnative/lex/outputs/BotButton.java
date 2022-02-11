// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BotButton {
    private final String text;
    private final String value;

    @OutputCustomType.Constructor({"text","value"})
    private BotButton(
        String text,
        String value) {
        this.text = Objects.requireNonNull(text);
        this.value = Objects.requireNonNull(value);
    }

    public String getText() {
        return this.text;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotButton defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String text;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(BotButton defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
    	      this.value = defaults.value;
        }

        public Builder setText(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public BotButton build() {
            return new BotButton(text, value);
        }
    }
}
