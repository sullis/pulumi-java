// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStepArchiveExtraction;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStepDpkgInstallation;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStepFileCopy;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStepFileExec;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStepMsiInstallation;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStepRpmInstallation;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStepScriptRun;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GuestPoliciesRecipeUpdateStep {
    /**
     * Extracts an archive into the specified directory.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeUpdateStepArchiveExtraction archiveExtraction;
    /**
     * Installs a deb file via dpkg.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeUpdateStepDpkgInstallation dpkgInstallation;
    /**
     * Copies a file onto the instance.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeUpdateStepFileCopy fileCopy;
    /**
     * Executes an artifact or local file.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeUpdateStepFileExec fileExec;
    /**
     * Installs an MSI file.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeUpdateStepMsiInstallation msiInstallation;
    /**
     * Installs an rpm file via the rpm utility.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeUpdateStepRpmInstallation rpmInstallation;
    /**
     * Runs commands in a shell.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesRecipeUpdateStepScriptRun scriptRun;

    @OutputCustomType.Constructor({"archiveExtraction","dpkgInstallation","fileCopy","fileExec","msiInstallation","rpmInstallation","scriptRun"})
    private GuestPoliciesRecipeUpdateStep(
        @Nullable GuestPoliciesRecipeUpdateStepArchiveExtraction archiveExtraction,
        @Nullable GuestPoliciesRecipeUpdateStepDpkgInstallation dpkgInstallation,
        @Nullable GuestPoliciesRecipeUpdateStepFileCopy fileCopy,
        @Nullable GuestPoliciesRecipeUpdateStepFileExec fileExec,
        @Nullable GuestPoliciesRecipeUpdateStepMsiInstallation msiInstallation,
        @Nullable GuestPoliciesRecipeUpdateStepRpmInstallation rpmInstallation,
        @Nullable GuestPoliciesRecipeUpdateStepScriptRun scriptRun) {
        this.archiveExtraction = archiveExtraction;
        this.dpkgInstallation = dpkgInstallation;
        this.fileCopy = fileCopy;
        this.fileExec = fileExec;
        this.msiInstallation = msiInstallation;
        this.rpmInstallation = rpmInstallation;
        this.scriptRun = scriptRun;
    }

    /**
     * Extracts an archive into the specified directory.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeUpdateStepArchiveExtraction> getArchiveExtraction() {
        return Optional.ofNullable(this.archiveExtraction);
    }
    /**
     * Installs a deb file via dpkg.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeUpdateStepDpkgInstallation> getDpkgInstallation() {
        return Optional.ofNullable(this.dpkgInstallation);
    }
    /**
     * Copies a file onto the instance.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeUpdateStepFileCopy> getFileCopy() {
        return Optional.ofNullable(this.fileCopy);
    }
    /**
     * Executes an artifact or local file.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeUpdateStepFileExec> getFileExec() {
        return Optional.ofNullable(this.fileExec);
    }
    /**
     * Installs an MSI file.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeUpdateStepMsiInstallation> getMsiInstallation() {
        return Optional.ofNullable(this.msiInstallation);
    }
    /**
     * Installs an rpm file via the rpm utility.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeUpdateStepRpmInstallation> getRpmInstallation() {
        return Optional.ofNullable(this.rpmInstallation);
    }
    /**
     * Runs commands in a shell.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesRecipeUpdateStepScriptRun> getScriptRun() {
        return Optional.ofNullable(this.scriptRun);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeUpdateStep defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GuestPoliciesRecipeUpdateStepArchiveExtraction archiveExtraction;
        private @Nullable GuestPoliciesRecipeUpdateStepDpkgInstallation dpkgInstallation;
        private @Nullable GuestPoliciesRecipeUpdateStepFileCopy fileCopy;
        private @Nullable GuestPoliciesRecipeUpdateStepFileExec fileExec;
        private @Nullable GuestPoliciesRecipeUpdateStepMsiInstallation msiInstallation;
        private @Nullable GuestPoliciesRecipeUpdateStepRpmInstallation rpmInstallation;
        private @Nullable GuestPoliciesRecipeUpdateStepScriptRun scriptRun;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeUpdateStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveExtraction = defaults.archiveExtraction;
    	      this.dpkgInstallation = defaults.dpkgInstallation;
    	      this.fileCopy = defaults.fileCopy;
    	      this.fileExec = defaults.fileExec;
    	      this.msiInstallation = defaults.msiInstallation;
    	      this.rpmInstallation = defaults.rpmInstallation;
    	      this.scriptRun = defaults.scriptRun;
        }

        public Builder setArchiveExtraction(@Nullable GuestPoliciesRecipeUpdateStepArchiveExtraction archiveExtraction) {
            this.archiveExtraction = archiveExtraction;
            return this;
        }

        public Builder setDpkgInstallation(@Nullable GuestPoliciesRecipeUpdateStepDpkgInstallation dpkgInstallation) {
            this.dpkgInstallation = dpkgInstallation;
            return this;
        }

        public Builder setFileCopy(@Nullable GuestPoliciesRecipeUpdateStepFileCopy fileCopy) {
            this.fileCopy = fileCopy;
            return this;
        }

        public Builder setFileExec(@Nullable GuestPoliciesRecipeUpdateStepFileExec fileExec) {
            this.fileExec = fileExec;
            return this;
        }

        public Builder setMsiInstallation(@Nullable GuestPoliciesRecipeUpdateStepMsiInstallation msiInstallation) {
            this.msiInstallation = msiInstallation;
            return this;
        }

        public Builder setRpmInstallation(@Nullable GuestPoliciesRecipeUpdateStepRpmInstallation rpmInstallation) {
            this.rpmInstallation = rpmInstallation;
            return this;
        }

        public Builder setScriptRun(@Nullable GuestPoliciesRecipeUpdateStepScriptRun scriptRun) {
            this.scriptRun = scriptRun;
            return this;
        }
        public GuestPoliciesRecipeUpdateStep build() {
            return new GuestPoliciesRecipeUpdateStep(archiveExtraction, dpkgInstallation, fileCopy, fileExec, msiInstallation, rpmInstallation, scriptRun);
        }
    }
}