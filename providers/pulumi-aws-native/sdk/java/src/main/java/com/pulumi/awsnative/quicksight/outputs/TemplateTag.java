// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TemplateTag {
    /**
     * @return &lt;p&gt;Tag key.&lt;/p&gt;
     * 
     */
    private final String key;
    /**
     * @return &lt;p&gt;Tag value.&lt;/p&gt;
     * 
     */
    private final String value;

    @CustomType.Constructor
    private TemplateTag(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return &lt;p&gt;Tag key.&lt;/p&gt;
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return &lt;p&gt;Tag value.&lt;/p&gt;
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public TemplateTag build() {
            return new TemplateTag(key, value);
        }
    }
}
