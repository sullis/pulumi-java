// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationApplicationCodeConfiguration {
    /**
     * @return The location and type of the application code.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent codeContent;
    /**
     * @return Specifies whether the code content is in text or zip format. Valid values: `PLAINTEXT`, `ZIPFILE`.
     * 
     */
    private final String codeContentType;

    @CustomType.Constructor
    private ApplicationApplicationConfigurationApplicationCodeConfiguration(
        @CustomType.Parameter("codeContent") @Nullable ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent codeContent,
        @CustomType.Parameter("codeContentType") String codeContentType) {
        this.codeContent = codeContent;
        this.codeContentType = codeContentType;
    }

    /**
     * @return The location and type of the application code.
     * 
     */
    public Optional<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent> codeContent() {
        return Optional.ofNullable(this.codeContent);
    }
    /**
     * @return Specifies whether the code content is in text or zip format. Valid values: `PLAINTEXT`, `ZIPFILE`.
     * 
     */
    public String codeContentType() {
        return this.codeContentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationApplicationCodeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent codeContent;
        private String codeContentType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationApplicationCodeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeContent = defaults.codeContent;
    	      this.codeContentType = defaults.codeContentType;
        }

        public Builder codeContent(@Nullable ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent codeContent) {
            this.codeContent = codeContent;
            return this;
        }
        public Builder codeContentType(String codeContentType) {
            this.codeContentType = Objects.requireNonNull(codeContentType);
            return this;
        }        public ApplicationApplicationConfigurationApplicationCodeConfiguration build() {
            return new ApplicationApplicationConfigurationApplicationCodeConfiguration(codeContent, codeContentType);
        }
    }
}
