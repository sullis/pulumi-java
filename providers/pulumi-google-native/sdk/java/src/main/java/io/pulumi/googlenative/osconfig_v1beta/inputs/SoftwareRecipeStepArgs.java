// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepCopyFileArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepExecFileArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepExtractArchiveArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepInstallDpkgArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepInstallMsiArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepInstallRpmArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepRunScriptArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An action that can be taken as part of installing or updating a recipe.
 * 
 */
public final class SoftwareRecipeStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeStepArgs Empty = new SoftwareRecipeStepArgs();

    /**
     * Extracts an archive into the specified directory.
     * 
     */
    @Import(name="archiveExtraction")
      private final @Nullable Output<SoftwareRecipeStepExtractArchiveArgs> archiveExtraction;

    public Output<SoftwareRecipeStepExtractArchiveArgs> getArchiveExtraction() {
        return this.archiveExtraction == null ? Output.empty() : this.archiveExtraction;
    }

    /**
     * Installs a deb file via dpkg.
     * 
     */
    @Import(name="dpkgInstallation")
      private final @Nullable Output<SoftwareRecipeStepInstallDpkgArgs> dpkgInstallation;

    public Output<SoftwareRecipeStepInstallDpkgArgs> getDpkgInstallation() {
        return this.dpkgInstallation == null ? Output.empty() : this.dpkgInstallation;
    }

    /**
     * Copies a file onto the instance.
     * 
     */
    @Import(name="fileCopy")
      private final @Nullable Output<SoftwareRecipeStepCopyFileArgs> fileCopy;

    public Output<SoftwareRecipeStepCopyFileArgs> getFileCopy() {
        return this.fileCopy == null ? Output.empty() : this.fileCopy;
    }

    /**
     * Executes an artifact or local file.
     * 
     */
    @Import(name="fileExec")
      private final @Nullable Output<SoftwareRecipeStepExecFileArgs> fileExec;

    public Output<SoftwareRecipeStepExecFileArgs> getFileExec() {
        return this.fileExec == null ? Output.empty() : this.fileExec;
    }

    /**
     * Installs an MSI file.
     * 
     */
    @Import(name="msiInstallation")
      private final @Nullable Output<SoftwareRecipeStepInstallMsiArgs> msiInstallation;

    public Output<SoftwareRecipeStepInstallMsiArgs> getMsiInstallation() {
        return this.msiInstallation == null ? Output.empty() : this.msiInstallation;
    }

    /**
     * Installs an rpm file via the rpm utility.
     * 
     */
    @Import(name="rpmInstallation")
      private final @Nullable Output<SoftwareRecipeStepInstallRpmArgs> rpmInstallation;

    public Output<SoftwareRecipeStepInstallRpmArgs> getRpmInstallation() {
        return this.rpmInstallation == null ? Output.empty() : this.rpmInstallation;
    }

    /**
     * Runs commands in a shell.
     * 
     */
    @Import(name="scriptRun")
      private final @Nullable Output<SoftwareRecipeStepRunScriptArgs> scriptRun;

    public Output<SoftwareRecipeStepRunScriptArgs> getScriptRun() {
        return this.scriptRun == null ? Output.empty() : this.scriptRun;
    }

    public SoftwareRecipeStepArgs(
        @Nullable Output<SoftwareRecipeStepExtractArchiveArgs> archiveExtraction,
        @Nullable Output<SoftwareRecipeStepInstallDpkgArgs> dpkgInstallation,
        @Nullable Output<SoftwareRecipeStepCopyFileArgs> fileCopy,
        @Nullable Output<SoftwareRecipeStepExecFileArgs> fileExec,
        @Nullable Output<SoftwareRecipeStepInstallMsiArgs> msiInstallation,
        @Nullable Output<SoftwareRecipeStepInstallRpmArgs> rpmInstallation,
        @Nullable Output<SoftwareRecipeStepRunScriptArgs> scriptRun) {
        this.archiveExtraction = archiveExtraction;
        this.dpkgInstallation = dpkgInstallation;
        this.fileCopy = fileCopy;
        this.fileExec = fileExec;
        this.msiInstallation = msiInstallation;
        this.rpmInstallation = rpmInstallation;
        this.scriptRun = scriptRun;
    }

    private SoftwareRecipeStepArgs() {
        this.archiveExtraction = Output.empty();
        this.dpkgInstallation = Output.empty();
        this.fileCopy = Output.empty();
        this.fileExec = Output.empty();
        this.msiInstallation = Output.empty();
        this.rpmInstallation = Output.empty();
        this.scriptRun = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SoftwareRecipeStepExtractArchiveArgs> archiveExtraction;
        private @Nullable Output<SoftwareRecipeStepInstallDpkgArgs> dpkgInstallation;
        private @Nullable Output<SoftwareRecipeStepCopyFileArgs> fileCopy;
        private @Nullable Output<SoftwareRecipeStepExecFileArgs> fileExec;
        private @Nullable Output<SoftwareRecipeStepInstallMsiArgs> msiInstallation;
        private @Nullable Output<SoftwareRecipeStepInstallRpmArgs> rpmInstallation;
        private @Nullable Output<SoftwareRecipeStepRunScriptArgs> scriptRun;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveExtraction = defaults.archiveExtraction;
    	      this.dpkgInstallation = defaults.dpkgInstallation;
    	      this.fileCopy = defaults.fileCopy;
    	      this.fileExec = defaults.fileExec;
    	      this.msiInstallation = defaults.msiInstallation;
    	      this.rpmInstallation = defaults.rpmInstallation;
    	      this.scriptRun = defaults.scriptRun;
        }

        public Builder archiveExtraction(@Nullable Output<SoftwareRecipeStepExtractArchiveArgs> archiveExtraction) {
            this.archiveExtraction = archiveExtraction;
            return this;
        }
        public Builder archiveExtraction(@Nullable SoftwareRecipeStepExtractArchiveArgs archiveExtraction) {
            this.archiveExtraction = Output.ofNullable(archiveExtraction);
            return this;
        }
        public Builder dpkgInstallation(@Nullable Output<SoftwareRecipeStepInstallDpkgArgs> dpkgInstallation) {
            this.dpkgInstallation = dpkgInstallation;
            return this;
        }
        public Builder dpkgInstallation(@Nullable SoftwareRecipeStepInstallDpkgArgs dpkgInstallation) {
            this.dpkgInstallation = Output.ofNullable(dpkgInstallation);
            return this;
        }
        public Builder fileCopy(@Nullable Output<SoftwareRecipeStepCopyFileArgs> fileCopy) {
            this.fileCopy = fileCopy;
            return this;
        }
        public Builder fileCopy(@Nullable SoftwareRecipeStepCopyFileArgs fileCopy) {
            this.fileCopy = Output.ofNullable(fileCopy);
            return this;
        }
        public Builder fileExec(@Nullable Output<SoftwareRecipeStepExecFileArgs> fileExec) {
            this.fileExec = fileExec;
            return this;
        }
        public Builder fileExec(@Nullable SoftwareRecipeStepExecFileArgs fileExec) {
            this.fileExec = Output.ofNullable(fileExec);
            return this;
        }
        public Builder msiInstallation(@Nullable Output<SoftwareRecipeStepInstallMsiArgs> msiInstallation) {
            this.msiInstallation = msiInstallation;
            return this;
        }
        public Builder msiInstallation(@Nullable SoftwareRecipeStepInstallMsiArgs msiInstallation) {
            this.msiInstallation = Output.ofNullable(msiInstallation);
            return this;
        }
        public Builder rpmInstallation(@Nullable Output<SoftwareRecipeStepInstallRpmArgs> rpmInstallation) {
            this.rpmInstallation = rpmInstallation;
            return this;
        }
        public Builder rpmInstallation(@Nullable SoftwareRecipeStepInstallRpmArgs rpmInstallation) {
            this.rpmInstallation = Output.ofNullable(rpmInstallation);
            return this;
        }
        public Builder scriptRun(@Nullable Output<SoftwareRecipeStepRunScriptArgs> scriptRun) {
            this.scriptRun = scriptRun;
            return this;
        }
        public Builder scriptRun(@Nullable SoftwareRecipeStepRunScriptArgs scriptRun) {
            this.scriptRun = Output.ofNullable(scriptRun);
            return this;
        }        public SoftwareRecipeStepArgs build() {
            return new SoftwareRecipeStepArgs(archiveExtraction, dpkgInstallation, fileCopy, fileExec, msiInstallation, rpmInstallation, scriptRun);
        }
    }
}
