package org.hawkinssoftware.rns.analysis.compile.util;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.AnnotationTypeDeclaration;
import org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration;
import org.eclipse.jdt.core.dom.AnonymousClassDeclaration;
import org.eclipse.jdt.core.dom.ArrayAccess;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.ArrayType;
import org.eclipse.jdt.core.dom.AssertStatement;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BlockComment;
import org.eclipse.jdt.core.dom.BooleanLiteral;
import org.eclipse.jdt.core.dom.BreakStatement;
import org.eclipse.jdt.core.dom.CastExpression;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.CharacterLiteral;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ConditionalExpression;
import org.eclipse.jdt.core.dom.ConstructorInvocation;
import org.eclipse.jdt.core.dom.ContinueStatement;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.EmptyStatement;
import org.eclipse.jdt.core.dom.EnhancedForStatement;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.Initializer;
import org.eclipse.jdt.core.dom.InstanceofExpression;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.LabeledStatement;
import org.eclipse.jdt.core.dom.LineComment;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberRef;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.MethodRef;
import org.eclipse.jdt.core.dom.MethodRefParameter;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.NullLiteral;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.ParenthesizedExpression;
import org.eclipse.jdt.core.dom.PostfixExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.QualifiedType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.SuperFieldAccess;
import org.eclipse.jdt.core.dom.SuperMethodInvocation;
import org.eclipse.jdt.core.dom.SwitchCase;
import org.eclipse.jdt.core.dom.SwitchStatement;
import org.eclipse.jdt.core.dom.SynchronizedStatement;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.TextElement;
import org.eclipse.jdt.core.dom.ThisExpression;
import org.eclipse.jdt.core.dom.ThrowStatement;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclarationStatement;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.TypeParameter;
import org.eclipse.jdt.core.dom.UnionType;
import org.eclipse.jdt.core.dom.VariableDeclarationExpression;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.WhileStatement;
import org.eclipse.jdt.core.dom.WildcardType;

public class EmptyASTVisitor extends ASTVisitor
{
	public boolean visit(AnnotationTypeDeclaration node)
	{
		return false;
	}

	public boolean visit(AnnotationTypeMemberDeclaration node)
	{
		return false;
	}

	public boolean visit(AnonymousClassDeclaration node)
	{
		return false;
	}

	public boolean visit(ArrayAccess node)
	{
		return false;
	}

	public boolean visit(ArrayCreation node)
	{
		return false;
	}

	public boolean visit(ArrayInitializer node)
	{
		return false;
	}

	public boolean visit(ArrayType node)
	{
		return false;
	}

	public boolean visit(AssertStatement node)
	{
		return false;
	}

	public boolean visit(Assignment node)
	{
		return false;
	}

	public boolean visit(Block node)
	{
		return false;
	}

	public boolean visit(BlockComment node)
	{
		return false;
	}

	public boolean visit(BooleanLiteral node)
	{
		return false;
	}

	public boolean visit(BreakStatement node)
	{
		return false;
	}

	public boolean visit(CastExpression node)
	{
		return false;
	}

	public boolean visit(CatchClause node)
	{
		return false;
	}

	public boolean visit(CharacterLiteral node)
	{
		return false;
	}

	public boolean visit(ClassInstanceCreation node)
	{
		return false;
	}

	public boolean visit(CompilationUnit node)
	{
		return false;
	}

	public boolean visit(ConditionalExpression node)
	{
		return false;
	}

	public boolean visit(ConstructorInvocation node)
	{
		return false;
	}

	public boolean visit(ContinueStatement node)
	{
		return false;
	}

	public boolean visit(DoStatement node)
	{
		return false;
	}

	public boolean visit(EmptyStatement node)
	{
		return false;
	}

	public boolean visit(EnhancedForStatement node)
	{
		return false;
	}

	public boolean visit(EnumConstantDeclaration node)
	{
		return false;
	}

	public boolean visit(EnumDeclaration node)
	{
		return false;
	}

	public boolean visit(ExpressionStatement node)
	{
		return false;
	}

	public boolean visit(FieldAccess node)
	{
		return false;
	}

	public boolean visit(FieldDeclaration node)
	{
		return false;
	}

	public boolean visit(ForStatement node)
	{
		return false;
	}

	public boolean visit(IfStatement node)
	{
		return false;
	}

	public boolean visit(ImportDeclaration node)
	{
		return false;
	}

	public boolean visit(InfixExpression node)
	{
		return false;
	}

	public boolean visit(Initializer node)
	{
		return false;
	}

	public boolean visit(InstanceofExpression node)
	{
		return false;
	}

	public boolean visit(Javadoc node)
	{
		return false;
	}

	public boolean visit(LabeledStatement node)
	{
		return false;
	}

	public boolean visit(LineComment node)
	{
		return false;
	}

	public boolean visit(MarkerAnnotation node)
	{
		return false;
	}

	public boolean visit(MemberRef node)
	{
		return false;
	}

	public boolean visit(MemberValuePair node)
	{
		return false;
	}

	public boolean visit(MethodDeclaration node)
	{
		return false;
	}

	public boolean visit(MethodInvocation node)
	{
		return false;
	}

	public boolean visit(MethodRef node)
	{
		return false;
	}

	public boolean visit(Modifier node)
	{
		return false;
	}

	public boolean visit(MethodRefParameter node)
	{
		return false;
	}

	public boolean visit(NormalAnnotation node)
	{
		return false;
	}

	public boolean visit(NullLiteral node)
	{
		return false;
	}

	public boolean visit(NumberLiteral node)
	{
		return false;
	}

	public boolean visit(PackageDeclaration node)
	{
		return false;
	}

	public boolean visit(ParameterizedType node)
	{
		return false;
	}

	public boolean visit(ParenthesizedExpression node)
	{
		return false;
	}

	public boolean visit(PostfixExpression node)
	{
		return false;
	}

	public boolean visit(PrefixExpression node)
	{
		return false;
	}

	public boolean visit(PrimitiveType node)
	{
		return false;
	}

	public boolean visit(QualifiedName node)
	{
		return false;
	}

	public boolean visit(QualifiedType node)
	{
		return false;
	}

	public boolean visit(ReturnStatement node)
	{
		return false;
	}

	public boolean visit(SimpleName node)
	{
		return false;
	}

	public boolean visit(SimpleType node)
	{
		return false;
	}

	public boolean visit(SingleMemberAnnotation node)
	{
		return false;
	}

	public boolean visit(SingleVariableDeclaration node)
	{
		return false;
	}

	public boolean visit(StringLiteral node)
	{
		return false;
	}

	public boolean visit(SuperConstructorInvocation node)
	{
		return false;
	}

	public boolean visit(SuperFieldAccess node)
	{
		return false;
	}

	public boolean visit(SuperMethodInvocation node)
	{
		return false;
	}

	public boolean visit(SwitchCase node)
	{
		return false;
	}

	public boolean visit(SwitchStatement node)
	{
		return false;
	}

	public boolean visit(SynchronizedStatement node)
	{
		return false;
	}

	public boolean visit(TagElement node)
	{
		return false;
	}

	public boolean visit(TextElement node)
	{
		return false;
	}

	public boolean visit(ThisExpression node)
	{
		return false;
	}

	public boolean visit(ThrowStatement node)
	{
		return false;
	}

	public boolean visit(TryStatement node)
	{
		return false;
	}

	public boolean visit(TypeDeclaration node)
	{
		return false;
	}

	public boolean visit(TypeDeclarationStatement node)
	{
		return false;
	}

	public boolean visit(TypeLiteral node)
	{
		return false;
	}

	public boolean visit(TypeParameter node)
	{
		return false;
	}

	public boolean visit(UnionType node)
	{
		return false;
	}

	public boolean visit(VariableDeclarationExpression node)
	{
		return false;
	}

	public boolean visit(VariableDeclarationFragment node)
	{
		return false;
	}

	public boolean visit(VariableDeclarationStatement node)
	{
		return false;
	}

	public boolean visit(WhileStatement node)
	{
		return false;
	}

	public boolean visit(WildcardType node)
	{
		return false;
	}
}
