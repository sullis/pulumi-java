// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class XssMatchSetXssMatchTupleFieldToMatch {
    /**
     * @return When the value of `type` is `HEADER`, enter the name of the header that you want the WAF to search, for example, `User-Agent` or `Referer`. If the value of `type` is any other value, omit `data`.
     * 
     */
    private final @Nullable String data;
    /**
     * @return The part of the web request that you want AWS WAF to search for a specified stringE.g., `HEADER` or `METHOD`
     * 
     */
    private final String type;

    @CustomType.Constructor
    private XssMatchSetXssMatchTupleFieldToMatch(
        @CustomType.Parameter("data") @Nullable String data,
        @CustomType.Parameter("type") String type) {
        this.data = data;
        this.type = type;
    }

    /**
     * @return When the value of `type` is `HEADER`, enter the name of the header that you want the WAF to search, for example, `User-Agent` or `Referer`. If the value of `type` is any other value, omit `data`.
     * 
     */
    public Optional<String> data() {
        return Optional.ofNullable(this.data);
    }
    /**
     * @return The part of the web request that you want AWS WAF to search for a specified stringE.g., `HEADER` or `METHOD`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XssMatchSetXssMatchTupleFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String data;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(XssMatchSetXssMatchTupleFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.type = defaults.type;
        }

        public Builder data(@Nullable String data) {
            this.data = data;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public XssMatchSetXssMatchTupleFieldToMatch build() {
            return new XssMatchSetXssMatchTupleFieldToMatch(data, type);
        }
    }
}
