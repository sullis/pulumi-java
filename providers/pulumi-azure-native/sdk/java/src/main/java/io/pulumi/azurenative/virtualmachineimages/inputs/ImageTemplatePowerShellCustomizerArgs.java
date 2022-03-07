// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Runs the specified PowerShell on the VM (Windows). Corresponds to Packer powershell provisioner. Exactly one of 'scriptUri' or 'inline' can be specified.
 * 
 */
public final class ImageTemplatePowerShellCustomizerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageTemplatePowerShellCustomizerArgs Empty = new ImageTemplatePowerShellCustomizerArgs();

    /**
     * Array of PowerShell commands to execute
     * 
     */
    @InputImport(name="inline")
      private final @Nullable Input<List<String>> inline;

    public Input<List<String>> getInline() {
        return this.inline == null ? Input.empty() : this.inline;
    }

    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * If specified, the PowerShell script will be run with elevated privileges using the Local System user. Can only be true when the runElevated field above is set to true.
     * 
     */
    @InputImport(name="runAsSystem")
      private final @Nullable Input<Boolean> runAsSystem;

    public Input<Boolean> getRunAsSystem() {
        return this.runAsSystem == null ? Input.empty() : this.runAsSystem;
    }

    /**
     * If specified, the PowerShell script will be run with elevated privileges
     * 
     */
    @InputImport(name="runElevated")
      private final @Nullable Input<Boolean> runElevated;

    public Input<Boolean> getRunElevated() {
        return this.runElevated == null ? Input.empty() : this.runElevated;
    }

    /**
     * URI of the PowerShell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc
     * 
     */
    @InputImport(name="scriptUri")
      private final @Nullable Input<String> scriptUri;

    public Input<String> getScriptUri() {
        return this.scriptUri == null ? Input.empty() : this.scriptUri;
    }

    /**
     * SHA256 checksum of the power shell script provided in the scriptUri field above
     * 
     */
    @InputImport(name="sha256Checksum")
      private final @Nullable Input<String> sha256Checksum;

    public Input<String> getSha256Checksum() {
        return this.sha256Checksum == null ? Input.empty() : this.sha256Checksum;
    }

    /**
     * The type of customization tool you want to use on the Image. For example, "Shell" can be shell customizer
     * Expected value is 'PowerShell'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Valid exit codes for the PowerShell script. [Default: 0]
     * 
     */
    @InputImport(name="validExitCodes")
      private final @Nullable Input<List<Integer>> validExitCodes;

    public Input<List<Integer>> getValidExitCodes() {
        return this.validExitCodes == null ? Input.empty() : this.validExitCodes;
    }

    public ImageTemplatePowerShellCustomizerArgs(
        @Nullable Input<List<String>> inline,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> runAsSystem,
        @Nullable Input<Boolean> runElevated,
        @Nullable Input<String> scriptUri,
        @Nullable Input<String> sha256Checksum,
        Input<String> type,
        @Nullable Input<List<Integer>> validExitCodes) {
        this.inline = inline;
        this.name = name;
        this.runAsSystem = runAsSystem == null ? Input.ofNullable(false) : runAsSystem;
        this.runElevated = runElevated == null ? Input.ofNullable(false) : runElevated;
        this.scriptUri = scriptUri;
        this.sha256Checksum = sha256Checksum == null ? Input.ofNullable("") : sha256Checksum;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.validExitCodes = validExitCodes;
    }

    private ImageTemplatePowerShellCustomizerArgs() {
        this.inline = Input.empty();
        this.name = Input.empty();
        this.runAsSystem = Input.empty();
        this.runElevated = Input.empty();
        this.scriptUri = Input.empty();
        this.sha256Checksum = Input.empty();
        this.type = Input.empty();
        this.validExitCodes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplatePowerShellCustomizerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> inline;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> runAsSystem;
        private @Nullable Input<Boolean> runElevated;
        private @Nullable Input<String> scriptUri;
        private @Nullable Input<String> sha256Checksum;
        private Input<String> type;
        private @Nullable Input<List<Integer>> validExitCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplatePowerShellCustomizerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inline = defaults.inline;
    	      this.name = defaults.name;
    	      this.runAsSystem = defaults.runAsSystem;
    	      this.runElevated = defaults.runElevated;
    	      this.scriptUri = defaults.scriptUri;
    	      this.sha256Checksum = defaults.sha256Checksum;
    	      this.type = defaults.type;
    	      this.validExitCodes = defaults.validExitCodes;
        }

        public Builder setInline(@Nullable Input<List<String>> inline) {
            this.inline = inline;
            return this;
        }

        public Builder setInline(@Nullable List<String> inline) {
            this.inline = Input.ofNullable(inline);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRunAsSystem(@Nullable Input<Boolean> runAsSystem) {
            this.runAsSystem = runAsSystem;
            return this;
        }

        public Builder setRunAsSystem(@Nullable Boolean runAsSystem) {
            this.runAsSystem = Input.ofNullable(runAsSystem);
            return this;
        }

        public Builder setRunElevated(@Nullable Input<Boolean> runElevated) {
            this.runElevated = runElevated;
            return this;
        }

        public Builder setRunElevated(@Nullable Boolean runElevated) {
            this.runElevated = Input.ofNullable(runElevated);
            return this;
        }

        public Builder setScriptUri(@Nullable Input<String> scriptUri) {
            this.scriptUri = scriptUri;
            return this;
        }

        public Builder setScriptUri(@Nullable String scriptUri) {
            this.scriptUri = Input.ofNullable(scriptUri);
            return this;
        }

        public Builder setSha256Checksum(@Nullable Input<String> sha256Checksum) {
            this.sha256Checksum = sha256Checksum;
            return this;
        }

        public Builder setSha256Checksum(@Nullable String sha256Checksum) {
            this.sha256Checksum = Input.ofNullable(sha256Checksum);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setValidExitCodes(@Nullable Input<List<Integer>> validExitCodes) {
            this.validExitCodes = validExitCodes;
            return this;
        }

        public Builder setValidExitCodes(@Nullable List<Integer> validExitCodes) {
            this.validExitCodes = Input.ofNullable(validExitCodes);
            return this;
        }
        public ImageTemplatePowerShellCustomizerArgs build() {
            return new ImageTemplatePowerShellCustomizerArgs(inline, name, runAsSystem, runElevated, scriptUri, sha256Checksum, type, validExitCodes);
        }
    }
}