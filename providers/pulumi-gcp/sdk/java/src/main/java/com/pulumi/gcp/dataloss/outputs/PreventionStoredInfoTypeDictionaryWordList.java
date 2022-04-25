// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PreventionStoredInfoTypeDictionaryWordList {
    /**
     * @return Words or phrases defining the dictionary. The dictionary must contain at least one
     * phrase and every phrase must contain at least 2 characters that are letters or digits.
     * 
     */
    private final List<String> words;

    @CustomType.Constructor
    private PreventionStoredInfoTypeDictionaryWordList(@CustomType.Parameter("words") List<String> words) {
        this.words = words;
    }

    /**
     * @return Words or phrases defining the dictionary. The dictionary must contain at least one
     * phrase and every phrase must contain at least 2 characters that are letters or digits.
     * 
     */
    public List<String> words() {
        return this.words;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeDictionaryWordList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> words;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeDictionaryWordList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.words = defaults.words;
        }

        public Builder words(List<String> words) {
            this.words = Objects.requireNonNull(words);
            return this;
        }
        public Builder words(String... words) {
            return words(List.of(words));
        }        public PreventionStoredInfoTypeDictionaryWordList build() {
            return new PreventionStoredInfoTypeDictionaryWordList(words);
        }
    }
}
