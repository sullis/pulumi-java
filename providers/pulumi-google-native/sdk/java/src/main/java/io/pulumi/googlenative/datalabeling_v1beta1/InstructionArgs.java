// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datalabeling_v1beta1.enums.InstructionDataType;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1PdfInstructionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstructionArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstructionArgs Empty = new InstructionArgs();

    /**
     * The data type of this instruction.
     * 
     */
    @Import(name="dataType", required=true)
      private final Output<InstructionDataType> dataType;

    public Output<InstructionDataType> getDataType() {
        return this.dataType;
    }

    /**
     * Optional. User-provided description of the instruction. The description can be up to 10000 characters long.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The display name of the instruction. Maximum of 64 characters.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Instruction from a PDF document. The PDF should be in a Cloud Storage bucket.
     * 
     */
    @Import(name="pdfInstruction")
      private final @Nullable Output<GoogleCloudDatalabelingV1beta1PdfInstructionArgs> pdfInstruction;

    public Output<GoogleCloudDatalabelingV1beta1PdfInstructionArgs> getPdfInstruction() {
        return this.pdfInstruction == null ? Output.empty() : this.pdfInstruction;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public InstructionArgs(
        Output<InstructionDataType> dataType,
        @Nullable Output<String> description,
        Output<String> displayName,
        @Nullable Output<GoogleCloudDatalabelingV1beta1PdfInstructionArgs> pdfInstruction,
        @Nullable Output<String> project) {
        this.dataType = Objects.requireNonNull(dataType, "expected parameter 'dataType' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.pdfInstruction = pdfInstruction;
        this.project = project;
    }

    private InstructionArgs() {
        this.dataType = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.pdfInstruction = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstructionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<InstructionDataType> dataType;
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private @Nullable Output<GoogleCloudDatalabelingV1beta1PdfInstructionArgs> pdfInstruction;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(InstructionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.pdfInstruction = defaults.pdfInstruction;
    	      this.project = defaults.project;
        }

        public Builder dataType(Output<InstructionDataType> dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }
        public Builder dataType(InstructionDataType dataType) {
            this.dataType = Output.of(Objects.requireNonNull(dataType));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder pdfInstruction(@Nullable Output<GoogleCloudDatalabelingV1beta1PdfInstructionArgs> pdfInstruction) {
            this.pdfInstruction = pdfInstruction;
            return this;
        }
        public Builder pdfInstruction(@Nullable GoogleCloudDatalabelingV1beta1PdfInstructionArgs pdfInstruction) {
            this.pdfInstruction = Output.ofNullable(pdfInstruction);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }        public InstructionArgs build() {
            return new InstructionArgs(dataType, description, displayName, pdfInstruction, project);
        }
    }
}
