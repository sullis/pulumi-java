// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Runs the specified PowerShell on the VM (Windows). Corresponds to Packer powershell provisioner. Exactly one of &#39;scriptUri&#39; or &#39;inline&#39; can be specified.
 * 
 */
public final class ImageTemplatePowerShellCustomizerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageTemplatePowerShellCustomizerArgs Empty = new ImageTemplatePowerShellCustomizerArgs();

    /**
     * Array of PowerShell commands to execute
     * 
     */
    @Import(name="inline")
    private @Nullable Output<List<String>> inline;

    /**
     * @return Array of PowerShell commands to execute
     * 
     */
    public Optional<Output<List<String>>> inline() {
        return Optional.ofNullable(this.inline);
    }

    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Friendly Name to provide context on what this customization step does
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * If specified, the PowerShell script will be run with elevated privileges using the Local System user. Can only be true when the runElevated field above is set to true.
     * 
     */
    @Import(name="runAsSystem")
    private @Nullable Output<Boolean> runAsSystem;

    /**
     * @return If specified, the PowerShell script will be run with elevated privileges using the Local System user. Can only be true when the runElevated field above is set to true.
     * 
     */
    public Optional<Output<Boolean>> runAsSystem() {
        return Optional.ofNullable(this.runAsSystem);
    }

    /**
     * If specified, the PowerShell script will be run with elevated privileges
     * 
     */
    @Import(name="runElevated")
    private @Nullable Output<Boolean> runElevated;

    /**
     * @return If specified, the PowerShell script will be run with elevated privileges
     * 
     */
    public Optional<Output<Boolean>> runElevated() {
        return Optional.ofNullable(this.runElevated);
    }

    /**
     * URI of the PowerShell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc
     * 
     */
    @Import(name="scriptUri")
    private @Nullable Output<String> scriptUri;

    /**
     * @return URI of the PowerShell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc
     * 
     */
    public Optional<Output<String>> scriptUri() {
        return Optional.ofNullable(this.scriptUri);
    }

    /**
     * SHA256 checksum of the power shell script provided in the scriptUri field above
     * 
     */
    @Import(name="sha256Checksum")
    private @Nullable Output<String> sha256Checksum;

    /**
     * @return SHA256 checksum of the power shell script provided in the scriptUri field above
     * 
     */
    public Optional<Output<String>> sha256Checksum() {
        return Optional.ofNullable(this.sha256Checksum);
    }

    /**
     * The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
     * Expected value is &#39;PowerShell&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
     * Expected value is &#39;PowerShell&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Valid exit codes for the PowerShell script. [Default: 0]
     * 
     */
    @Import(name="validExitCodes")
    private @Nullable Output<List<Integer>> validExitCodes;

    /**
     * @return Valid exit codes for the PowerShell script. [Default: 0]
     * 
     */
    public Optional<Output<List<Integer>>> validExitCodes() {
        return Optional.ofNullable(this.validExitCodes);
    }

    private ImageTemplatePowerShellCustomizerArgs() {}

    private ImageTemplatePowerShellCustomizerArgs(ImageTemplatePowerShellCustomizerArgs $) {
        this.inline = $.inline;
        this.name = $.name;
        this.runAsSystem = $.runAsSystem;
        this.runElevated = $.runElevated;
        this.scriptUri = $.scriptUri;
        this.sha256Checksum = $.sha256Checksum;
        this.type = $.type;
        this.validExitCodes = $.validExitCodes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageTemplatePowerShellCustomizerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageTemplatePowerShellCustomizerArgs $;

        public Builder() {
            $ = new ImageTemplatePowerShellCustomizerArgs();
        }

        public Builder(ImageTemplatePowerShellCustomizerArgs defaults) {
            $ = new ImageTemplatePowerShellCustomizerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inline Array of PowerShell commands to execute
         * 
         * @return builder
         * 
         */
        public Builder inline(@Nullable Output<List<String>> inline) {
            $.inline = inline;
            return this;
        }

        /**
         * @param inline Array of PowerShell commands to execute
         * 
         * @return builder
         * 
         */
        public Builder inline(List<String> inline) {
            return inline(Output.of(inline));
        }

        /**
         * @param inline Array of PowerShell commands to execute
         * 
         * @return builder
         * 
         */
        public Builder inline(String... inline) {
            return inline(List.of(inline));
        }

        /**
         * @param name Friendly Name to provide context on what this customization step does
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly Name to provide context on what this customization step does
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param runAsSystem If specified, the PowerShell script will be run with elevated privileges using the Local System user. Can only be true when the runElevated field above is set to true.
         * 
         * @return builder
         * 
         */
        public Builder runAsSystem(@Nullable Output<Boolean> runAsSystem) {
            $.runAsSystem = runAsSystem;
            return this;
        }

        /**
         * @param runAsSystem If specified, the PowerShell script will be run with elevated privileges using the Local System user. Can only be true when the runElevated field above is set to true.
         * 
         * @return builder
         * 
         */
        public Builder runAsSystem(Boolean runAsSystem) {
            return runAsSystem(Output.of(runAsSystem));
        }

        /**
         * @param runElevated If specified, the PowerShell script will be run with elevated privileges
         * 
         * @return builder
         * 
         */
        public Builder runElevated(@Nullable Output<Boolean> runElevated) {
            $.runElevated = runElevated;
            return this;
        }

        /**
         * @param runElevated If specified, the PowerShell script will be run with elevated privileges
         * 
         * @return builder
         * 
         */
        public Builder runElevated(Boolean runElevated) {
            return runElevated(Output.of(runElevated));
        }

        /**
         * @param scriptUri URI of the PowerShell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc
         * 
         * @return builder
         * 
         */
        public Builder scriptUri(@Nullable Output<String> scriptUri) {
            $.scriptUri = scriptUri;
            return this;
        }

        /**
         * @param scriptUri URI of the PowerShell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc
         * 
         * @return builder
         * 
         */
        public Builder scriptUri(String scriptUri) {
            return scriptUri(Output.of(scriptUri));
        }

        /**
         * @param sha256Checksum SHA256 checksum of the power shell script provided in the scriptUri field above
         * 
         * @return builder
         * 
         */
        public Builder sha256Checksum(@Nullable Output<String> sha256Checksum) {
            $.sha256Checksum = sha256Checksum;
            return this;
        }

        /**
         * @param sha256Checksum SHA256 checksum of the power shell script provided in the scriptUri field above
         * 
         * @return builder
         * 
         */
        public Builder sha256Checksum(String sha256Checksum) {
            return sha256Checksum(Output.of(sha256Checksum));
        }

        /**
         * @param type The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
         * Expected value is &#39;PowerShell&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of customization tool you want to use on the Image. For example, &#34;Shell&#34; can be shell customizer
         * Expected value is &#39;PowerShell&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param validExitCodes Valid exit codes for the PowerShell script. [Default: 0]
         * 
         * @return builder
         * 
         */
        public Builder validExitCodes(@Nullable Output<List<Integer>> validExitCodes) {
            $.validExitCodes = validExitCodes;
            return this;
        }

        /**
         * @param validExitCodes Valid exit codes for the PowerShell script. [Default: 0]
         * 
         * @return builder
         * 
         */
        public Builder validExitCodes(List<Integer> validExitCodes) {
            return validExitCodes(Output.of(validExitCodes));
        }

        /**
         * @param validExitCodes Valid exit codes for the PowerShell script. [Default: 0]
         * 
         * @return builder
         * 
         */
        public Builder validExitCodes(Integer... validExitCodes) {
            return validExitCodes(List.of(validExitCodes));
        }

        public ImageTemplatePowerShellCustomizerArgs build() {
            $.runAsSystem = Codegen.booleanProp("runAsSystem").output().arg($.runAsSystem).def(false).getNullable();
            $.runElevated = Codegen.booleanProp("runElevated").output().arg($.runElevated).def(false).getNullable();
            $.sha256Checksum = Codegen.stringProp("sha256Checksum").output().arg($.sha256Checksum).def("").getNullable();
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
