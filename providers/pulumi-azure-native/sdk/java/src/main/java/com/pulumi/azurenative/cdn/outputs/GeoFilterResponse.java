// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GeoFilterResponse {
    /**
     * @return Action of the geo filter, i.e. allow or block access.
     * 
     */
    private final String action;
    /**
     * @return Two letter country codes defining user country access in a geo filter, e.g. AU, MX, US.
     * 
     */
    private final List<String> countryCodes;
    /**
     * @return Relative path applicable to geo filter. (e.g. &#39;/mypictures&#39;, &#39;/mypicture/kitty.jpg&#39;, and etc.)
     * 
     */
    private final String relativePath;

    @CustomType.Constructor
    private GeoFilterResponse(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("countryCodes") List<String> countryCodes,
        @CustomType.Parameter("relativePath") String relativePath) {
        this.action = action;
        this.countryCodes = countryCodes;
        this.relativePath = relativePath;
    }

    /**
     * @return Action of the geo filter, i.e. allow or block access.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return Two letter country codes defining user country access in a geo filter, e.g. AU, MX, US.
     * 
     */
    public List<String> countryCodes() {
        return this.countryCodes;
    }
    /**
     * @return Relative path applicable to geo filter. (e.g. &#39;/mypictures&#39;, &#39;/mypicture/kitty.jpg&#39;, and etc.)
     * 
     */
    public String relativePath() {
        return this.relativePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GeoFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private List<String> countryCodes;
        private String relativePath;

        public Builder() {
    	      // Empty
        }

        public Builder(GeoFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.countryCodes = defaults.countryCodes;
    	      this.relativePath = defaults.relativePath;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder countryCodes(List<String> countryCodes) {
            this.countryCodes = Objects.requireNonNull(countryCodes);
            return this;
        }
        public Builder countryCodes(String... countryCodes) {
            return countryCodes(List.of(countryCodes));
        }
        public Builder relativePath(String relativePath) {
            this.relativePath = Objects.requireNonNull(relativePath);
            return this;
        }        public GeoFilterResponse build() {
            return new GeoFilterResponse(action, countryCodes, relativePath);
        }
    }
}
