// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageTemplateRestartCustomizerResponse {
    /**
     * @return Friendly Name to provide context on what this customization step does
     * 
     */
    private final @Nullable String name;
    /**
     * @return Command to check if restart succeeded [Default: &#39;&#39;]
     * 
     */
    private final @Nullable String restartCheckCommand;
    /**
     * @return Command to execute the restart [Default: &#39;shutdown /r /f /t 0 /c &#34;packer restart&#34;&#39;]
     * 
     */
    private final @Nullable String restartCommand;
    /**
     * @return Restart timeout specified as a string of magnitude and unit, e.g. &#39;5m&#39; (5 minutes) or &#39;2h&#39; (2 hours) [Default: &#39;5m&#39;]
     * 
     */
    private final @Nullable String restartTimeout;
    /**
     * @return The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
     * Expected value is &#39;WindowsRestart&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ImageTemplateRestartCustomizerResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("restartCheckCommand") @Nullable String restartCheckCommand,
        @CustomType.Parameter("restartCommand") @Nullable String restartCommand,
        @CustomType.Parameter("restartTimeout") @Nullable String restartTimeout,
        @CustomType.Parameter("type") String type) {
        this.name = name;
        this.restartCheckCommand = restartCheckCommand;
        this.restartCommand = restartCommand;
        this.restartTimeout = restartTimeout;
        this.type = type;
    }

    /**
     * @return Friendly Name to provide context on what this customization step does
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Command to check if restart succeeded [Default: &#39;&#39;]
     * 
     */
    public Optional<String> restartCheckCommand() {
        return Optional.ofNullable(this.restartCheckCommand);
    }
    /**
     * @return Command to execute the restart [Default: &#39;shutdown /r /f /t 0 /c &#34;packer restart&#34;&#39;]
     * 
     */
    public Optional<String> restartCommand() {
        return Optional.ofNullable(this.restartCommand);
    }
    /**
     * @return Restart timeout specified as a string of magnitude and unit, e.g. &#39;5m&#39; (5 minutes) or &#39;2h&#39; (2 hours) [Default: &#39;5m&#39;]
     * 
     */
    public Optional<String> restartTimeout() {
        return Optional.ofNullable(this.restartTimeout);
    }
    /**
     * @return The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
     * Expected value is &#39;WindowsRestart&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateRestartCustomizerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String restartCheckCommand;
        private @Nullable String restartCommand;
        private @Nullable String restartTimeout;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateRestartCustomizerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.restartCheckCommand = defaults.restartCheckCommand;
    	      this.restartCommand = defaults.restartCommand;
    	      this.restartTimeout = defaults.restartTimeout;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder restartCheckCommand(@Nullable String restartCheckCommand) {
            this.restartCheckCommand = restartCheckCommand;
            return this;
        }
        public Builder restartCommand(@Nullable String restartCommand) {
            this.restartCommand = restartCommand;
            return this;
        }
        public Builder restartTimeout(@Nullable String restartTimeout) {
            this.restartTimeout = restartTimeout;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ImageTemplateRestartCustomizerResponse build() {
            return new ImageTemplateRestartCustomizerResponse(name, restartCheckCommand, restartCommand, restartTimeout, type);
        }
    }
}
