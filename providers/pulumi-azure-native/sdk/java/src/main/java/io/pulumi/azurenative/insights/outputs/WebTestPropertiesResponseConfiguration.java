// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebTestPropertiesResponseConfiguration {
    /**
     * The XML specification of a WebTest to run against an application.
     * 
     */
    private final @Nullable String webTest;

    @OutputCustomType.Constructor({"webTest"})
    private WebTestPropertiesResponseConfiguration(@Nullable String webTest) {
        this.webTest = webTest;
    }

    /**
     * The XML specification of a WebTest to run against an application.
     * 
     */
    public Optional<String> getWebTest() {
        return Optional.ofNullable(this.webTest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebTestPropertiesResponseConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String webTest;

        public Builder() {
    	      // Empty
        }

        public Builder(WebTestPropertiesResponseConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.webTest = defaults.webTest;
        }

        public Builder setWebTest(@Nullable String webTest) {
            this.webTest = webTest;
            return this;
        }

        public WebTestPropertiesResponseConfiguration build() {
            return new WebTestPropertiesResponseConfiguration(webTest);
        }
    }
}
